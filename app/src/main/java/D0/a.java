package D0;

import D0.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: o, reason: collision with root package name */
    protected boolean f1120o;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f1121s;

    /* renamed from: t, reason: collision with root package name */
    protected Cursor f1122t;

    /* renamed from: u, reason: collision with root package name */
    protected Context f1123u;

    /* renamed from: v, reason: collision with root package name */
    protected int f1124v;

    /* renamed from: w, reason: collision with root package name */
    protected C0027a f1125w;

    /* renamed from: x, reason: collision with root package name */
    protected DataSetObserver f1126x;

    /* renamed from: y, reason: collision with root package name */
    protected D0.b f1127y;

    /* renamed from: D0.a$a, reason: collision with other inner class name */
    private class C0027a extends ContentObserver {
        C0027a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z7) {
            a.this.s();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f1120o = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f1120o = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z7) {
        n(context, cursor, z7 ? 1 : 2);
    }

    @Override // D0.b.a
    public void a(Cursor cursor) {
        Cursor t7 = t(cursor);
        if (t7 != null) {
            t7.close();
        }
    }

    @Override // D0.b.a
    public Cursor b() {
        return this.f1122t;
    }

    @Override // D0.b.a
    public abstract CharSequence d(Cursor cursor);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f1120o || (cursor = this.f1122t) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
        if (!this.f1120o) {
            return null;
        }
        this.f1122t.moveToPosition(i8);
        if (view == null) {
            view = q(this.f1123u, this.f1122t, viewGroup);
        }
        m(view, this.f1123u, this.f1122t);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f1127y == null) {
            this.f1127y = new D0.b(this);
        }
        return this.f1127y;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i8) {
        Cursor cursor;
        if (!this.f1120o || (cursor = this.f1122t) == null) {
            return null;
        }
        cursor.moveToPosition(i8);
        return this.f1122t;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        Cursor cursor;
        if (this.f1120o && (cursor = this.f1122t) != null && cursor.moveToPosition(i8)) {
            return this.f1122t.getLong(this.f1124v);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        if (!this.f1120o) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f1122t.moveToPosition(i8)) {
            if (view == null) {
                view = r(this.f1123u, this.f1122t, viewGroup);
            }
            m(view, this.f1123u, this.f1122t);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i8);
    }

    public abstract void m(View view, Context context, Cursor cursor);

    void n(Context context, Cursor cursor, int i8) {
        if ((i8 & 1) == 1) {
            i8 |= 2;
            this.f1121s = true;
        } else {
            this.f1121s = false;
        }
        boolean z7 = cursor != null;
        this.f1122t = cursor;
        this.f1120o = z7;
        this.f1123u = context;
        this.f1124v = z7 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i8 & 2) == 2) {
            this.f1125w = new C0027a();
            this.f1126x = new b();
        } else {
            this.f1125w = null;
            this.f1126x = null;
        }
        if (z7) {
            C0027a c0027a = this.f1125w;
            if (c0027a != null) {
                cursor.registerContentObserver(c0027a);
            }
            DataSetObserver dataSetObserver = this.f1126x;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View q(Context context, Cursor cursor, ViewGroup viewGroup);

    public abstract View r(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void s() {
        Cursor cursor;
        if (!this.f1121s || (cursor = this.f1122t) == null || cursor.isClosed()) {
            return;
        }
        this.f1120o = this.f1122t.requery();
    }

    public Cursor t(Cursor cursor) {
        Cursor cursor2 = this.f1122t;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0027a c0027a = this.f1125w;
            if (c0027a != null) {
                cursor2.unregisterContentObserver(c0027a);
            }
            DataSetObserver dataSetObserver = this.f1126x;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1122t = cursor;
        if (cursor != null) {
            C0027a c0027a2 = this.f1125w;
            if (c0027a2 != null) {
                cursor.registerContentObserver(c0027a2);
            }
            DataSetObserver dataSetObserver2 = this.f1126x;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f1124v = cursor.getColumnIndexOrThrow("_id");
            this.f1120o = true;
            notifyDataSetChanged();
        } else {
            this.f1124v = -1;
            this.f1120o = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
