package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* loaded from: classes2.dex */
class A extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private final j f31759d;

    public static class a extends RecyclerView.F {

        /* renamed from: u, reason: collision with root package name */
        final TextView f31760u;

        a(TextView textView) {
            super(textView);
            this.f31760u = textView;
        }
    }

    A(j jVar) {
        this.f31759d = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int E() {
        return this.f31759d.m2().l();
    }

    int d0(int i8) {
        return i8 - this.f31759d.m2().k().f31876t;
    }

    int e0(int i8) {
        return this.f31759d.m2().k().f31876t + i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void S(a aVar, int i8) {
        int e02 = e0(i8);
        aVar.f31760u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(e02)));
        TextView textView = aVar.f31760u;
        textView.setContentDescription(f.e(textView.getContext(), e02));
        c n22 = this.f31759d.n2();
        if (z.i().get(1) == e02) {
            b bVar = n22.f31789f;
        } else {
            b bVar2 = n22.f31787d;
        }
        this.f31759d.p2();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public a U(ViewGroup viewGroup, int i8) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(D3.h.f1577t, viewGroup, false));
    }
}
