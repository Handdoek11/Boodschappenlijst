package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.f0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f7070t = {R.attr.background, R.attr.divider};

    /* renamed from: o, reason: collision with root package name */
    private e f7071o;

    /* renamed from: s, reason: collision with root package name */
    private int f7072s;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(g gVar) {
        return this.f7071o.M(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(e eVar) {
        this.f7071o = eVar;
    }

    public int getWindowAnimations() {
        return this.f7072s;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
        a((g) getAdapter().getItem(i8));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        f0 v7 = f0.v(context, attributeSet, f7070t, i8, 0);
        if (v7.s(0)) {
            setBackgroundDrawable(v7.g(0));
        }
        if (v7.s(1)) {
            setDivider(v7.g(1));
        }
        v7.x();
    }
}
