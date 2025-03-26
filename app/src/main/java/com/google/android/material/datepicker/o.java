package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
class o extends BaseAdapter {

    /* renamed from: v, reason: collision with root package name */
    static final int f31881v = z.k().getMaximum(4);

    /* renamed from: w, reason: collision with root package name */
    private static final int f31882w = (z.k().getMaximum(5) + z.k().getMaximum(7)) - 1;

    /* renamed from: o, reason: collision with root package name */
    final n f31883o;

    /* renamed from: s, reason: collision with root package name */
    private Collection f31884s;

    /* renamed from: t, reason: collision with root package name */
    c f31885t;

    /* renamed from: u, reason: collision with root package name */
    final C5465a f31886u;

    o(n nVar, d dVar, C5465a c5465a, h hVar) {
        this.f31883o = nVar;
        this.f31886u = c5465a;
        this.f31884s = dVar.l0();
    }

    private String c(Context context, long j8) {
        return f.a(context, j8, j(j8), i(j8), g(j8));
    }

    private void f(Context context) {
        if (this.f31885t == null) {
            this.f31885t = new c(context);
        }
    }

    private boolean h(long j8) {
        throw null;
    }

    private boolean j(long j8) {
        return z.i().getTimeInMillis() == j8;
    }

    private void m(TextView textView, long j8, int i8) {
        b bVar;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(c(textView.getContext(), j8));
        if (this.f31886u.f().c0(j8)) {
            textView.setEnabled(true);
            boolean h8 = h(j8);
            textView.setSelected(h8);
            bVar = h8 ? this.f31885t.f31785b : j(j8) ? this.f31885t.f31786c : this.f31885t.f31784a;
        } else {
            textView.setEnabled(false);
            bVar = this.f31885t.f31790g;
        }
        bVar.b(textView);
    }

    private void n(MaterialCalendarGridView materialCalendarGridView, long j8) {
        if (n.f(j8).equals(this.f31883o)) {
            int k8 = this.f31883o.k(j8);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(k8) - materialCalendarGridView.getFirstVisiblePosition()), j8, k8);
        }
    }

    int a(int i8) {
        return b() + (i8 - 1);
    }

    int b() {
        return this.f31883o.h(this.f31886u.h());
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i8) {
        if (i8 < b() || i8 > k()) {
            return null;
        }
        return Long.valueOf(this.f31883o.i(l(i8)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = 1
            android.content.Context r1 = r8.getContext()
            r5.f(r1)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 0
            if (r7 != 0) goto L1f
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r1 = D3.h.f1572o
            android.view.View r7 = r7.inflate(r1, r8, r2)
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
        L1f:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.n r8 = r5.f31883o
            int r3 = r8.f31878v
            if (r7 < r3) goto L2e
            goto L54
        L2e:
            int r7 = r7 + r0
            r1.setTag(r8)
            android.content.res.Resources r8 = r1.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r2] = r3
            java.lang.String r3 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r3, r4)
            r1.setText(r8)
            r1.setVisibility(r2)
            r1.setEnabled(r0)
            goto L5d
        L54:
            r7 = 8
            r1.setVisibility(r7)
            r1.setEnabled(r2)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r1
        L64:
            long r2 = r6.longValue()
            r5.m(r1, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.o.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    boolean g(long j8) {
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f31882w;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return i8 / this.f31883o.f31877u;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(long j8) {
        throw null;
    }

    int k() {
        return (b() + this.f31883o.f31878v) - 1;
    }

    int l(int i8) {
        return (i8 - b()) + 1;
    }

    public void o(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f31884s.iterator();
        while (it.hasNext()) {
            n(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    boolean p(int i8) {
        return i8 >= b() && i8 <= k();
    }
}
