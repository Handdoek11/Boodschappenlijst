package D0;

import android.database.Cursor;
import android.widget.Filter;

/* loaded from: classes.dex */
class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    a f1130a;

    interface a {
        void a(Cursor cursor);

        Cursor b();

        CharSequence d(Cursor cursor);

        Cursor g(CharSequence charSequence);
    }

    b(a aVar) {
        this.f1130a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f1130a.d((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor g8 = this.f1130a.g(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (g8 != null) {
            filterResults.count = g8.getCount();
            filterResults.values = g8;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b8 = this.f1130a.b();
        Object obj = filterResults.values;
        if (obj == null || obj == b8) {
            return;
        }
        this.f1130a.a((Cursor) obj);
    }
}
