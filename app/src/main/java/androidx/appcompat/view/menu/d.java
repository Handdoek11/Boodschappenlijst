package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: o, reason: collision with root package name */
    e f7148o;

    /* renamed from: s, reason: collision with root package name */
    private int f7149s = -1;

    /* renamed from: t, reason: collision with root package name */
    private boolean f7150t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f7151u;

    /* renamed from: v, reason: collision with root package name */
    private final LayoutInflater f7152v;

    /* renamed from: w, reason: collision with root package name */
    private final int f7153w;

    public d(e eVar, LayoutInflater layoutInflater, boolean z7, int i8) {
        this.f7151u = z7;
        this.f7152v = layoutInflater;
        this.f7148o = eVar;
        this.f7153w = i8;
        a();
    }

    void a() {
        g v7 = this.f7148o.v();
        if (v7 != null) {
            ArrayList z7 = this.f7148o.z();
            int size = z7.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (((g) z7.get(i8)) == v7) {
                    this.f7149s = i8;
                    return;
                }
            }
        }
        this.f7149s = -1;
    }

    public e b() {
        return this.f7148o;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i8) {
        ArrayList z7 = this.f7151u ? this.f7148o.z() : this.f7148o.E();
        int i9 = this.f7149s;
        if (i9 >= 0 && i8 >= i9) {
            i8++;
        }
        return (g) z7.get(i8);
    }

    public void d(boolean z7) {
        this.f7150t = z7;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7149s < 0 ? (this.f7151u ? this.f7148o.z() : this.f7148o.E()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return i8;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f7152v.inflate(this.f7153w, viewGroup, false);
        }
        int groupId = getItem(i8).getGroupId();
        int i9 = i8 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f7148o.G() && groupId != (i9 >= 0 ? getItem(i9).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f7150t) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.g(getItem(i8), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
