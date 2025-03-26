package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import f.AbstractC5758g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c implements j, AdapterView.OnItemClickListener {

    /* renamed from: o, reason: collision with root package name */
    Context f7137o;

    /* renamed from: s, reason: collision with root package name */
    LayoutInflater f7138s;

    /* renamed from: t, reason: collision with root package name */
    e f7139t;

    /* renamed from: u, reason: collision with root package name */
    ExpandedMenuView f7140u;

    /* renamed from: v, reason: collision with root package name */
    int f7141v;

    /* renamed from: w, reason: collision with root package name */
    int f7142w;

    /* renamed from: x, reason: collision with root package name */
    int f7143x;

    /* renamed from: y, reason: collision with root package name */
    private j.a f7144y;

    /* renamed from: z, reason: collision with root package name */
    a f7145z;

    private class a extends BaseAdapter {

        /* renamed from: o, reason: collision with root package name */
        private int f7146o = -1;

        public a() {
            a();
        }

        void a() {
            g v7 = c.this.f7139t.v();
            if (v7 != null) {
                ArrayList z7 = c.this.f7139t.z();
                int size = z7.size();
                for (int i8 = 0; i8 < size; i8++) {
                    if (((g) z7.get(i8)) == v7) {
                        this.f7146o = i8;
                        return;
                    }
                }
            }
            this.f7146o = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g getItem(int i8) {
            ArrayList z7 = c.this.f7139t.z();
            int i9 = i8 + c.this.f7141v;
            int i10 = this.f7146o;
            if (i10 >= 0 && i9 >= i10) {
                i9++;
            }
            return (g) z7.get(i9);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = c.this.f7139t.z().size() - c.this.f7141v;
            return this.f7146o < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            if (view == null) {
                c cVar = c.this;
                view = cVar.f7138s.inflate(cVar.f7143x, viewGroup, false);
            }
            ((k.a) view).g(getItem(i8), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i8) {
        this(i8, 0);
        this.f7137o = context;
        this.f7138s = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f7145z == null) {
            this.f7145z = new a();
        }
        return this.f7145z;
    }

    public k b(ViewGroup viewGroup) {
        if (this.f7140u == null) {
            this.f7140u = (ExpandedMenuView) this.f7138s.inflate(AbstractC5758g.f35515g, viewGroup, false);
            if (this.f7145z == null) {
                this.f7145z = new a();
            }
            this.f7140u.setAdapter((ListAdapter) this.f7145z);
            this.f7140u.setOnItemClickListener(this);
        }
        return this.f7140u;
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar, boolean z7) {
        j.a aVar = this.f7144y;
        if (aVar != null) {
            aVar.c(eVar, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void d(boolean z7) {
        a aVar = this.f7145z;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean f(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public void h(j.a aVar) {
        this.f7144y = aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public void i(Context context, e eVar) {
        if (this.f7142w != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f7142w);
            this.f7137o = contextThemeWrapper;
            this.f7138s = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f7137o != null) {
            this.f7137o = context;
            if (this.f7138s == null) {
                this.f7138s = LayoutInflater.from(context);
            }
        }
        this.f7139t = eVar;
        a aVar = this.f7145z;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        new f(mVar).b(null);
        j.a aVar = this.f7144y;
        if (aVar == null) {
            return true;
        }
        aVar.d(mVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
        this.f7139t.N(this.f7145z.getItem(i8), this, 0);
    }

    public c(int i8, int i9) {
        this.f7143x = i8;
        this.f7142w = i9;
    }
}
