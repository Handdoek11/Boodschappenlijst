package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import z0.X;

/* loaded from: classes2.dex */
class p extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private final C5465a f31887d;

    /* renamed from: e, reason: collision with root package name */
    private final j.m f31888e;

    /* renamed from: f, reason: collision with root package name */
    private final int f31889f;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f31890o;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f31890o = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
            if (this.f31890o.getAdapter().p(i8)) {
                p.this.f31888e.a(this.f31890o.getAdapter().getItem(i8).longValue());
            }
        }
    }

    public static class b extends RecyclerView.F {

        /* renamed from: u, reason: collision with root package name */
        final TextView f31892u;

        /* renamed from: v, reason: collision with root package name */
        final MaterialCalendarGridView f31893v;

        b(LinearLayout linearLayout, boolean z7) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(D3.f.f1550u);
            this.f31892u = textView;
            X.o0(textView, true);
            this.f31893v = (MaterialCalendarGridView) linearLayout.findViewById(D3.f.f1546q);
            if (z7) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    p(Context context, d dVar, C5465a c5465a, h hVar, j.m mVar) {
        n k8 = c5465a.k();
        n g8 = c5465a.g();
        n j8 = c5465a.j();
        if (k8.compareTo(j8) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (j8.compareTo(g8) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f31889f = (o.f31881v * j.q2(context)) + (l.C2(context) ? j.q2(context) : 0);
        this.f31887d = c5465a;
        this.f31888e = mVar;
        b0(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int E() {
        return this.f31887d.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long F(int i8) {
        return this.f31887d.k().p(i8).m();
    }

    n e0(int i8) {
        return this.f31887d.k().p(i8);
    }

    CharSequence f0(int i8) {
        return e0(i8).l();
    }

    int g0(n nVar) {
        return this.f31887d.k().q(nVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void S(b bVar, int i8) {
        n p8 = this.f31887d.k().p(i8);
        bVar.f31892u.setText(p8.l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f31893v.findViewById(D3.f.f1546q);
        if (materialCalendarGridView.getAdapter() == null || !p8.equals(materialCalendarGridView.getAdapter().f31883o)) {
            o oVar = new o(p8, null, this.f31887d, null);
            materialCalendarGridView.setNumColumns(p8.f31877u);
            materialCalendarGridView.setAdapter((ListAdapter) oVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public b U(ViewGroup viewGroup, int i8) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(D3.h.f1575r, viewGroup, false);
        if (!l.C2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f31889f));
        return new b(linearLayout, true);
    }
}
