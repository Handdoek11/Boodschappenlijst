package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
class i extends BaseAdapter {

    /* renamed from: u, reason: collision with root package name */
    private static final int f31793u;

    /* renamed from: o, reason: collision with root package name */
    private final Calendar f31794o;

    /* renamed from: s, reason: collision with root package name */
    private final int f31795s;

    /* renamed from: t, reason: collision with root package name */
    private final int f31796t;

    static {
        f31793u = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public i() {
        Calendar k8 = z.k();
        this.f31794o = k8;
        this.f31795s = k8.getMaximum(7);
        this.f31796t = k8.getFirstDayOfWeek();
    }

    private int b(int i8) {
        int i9 = i8 + this.f31796t;
        int i10 = this.f31795s;
        return i9 > i10 ? i9 - i10 : i9;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i8) {
        if (i8 >= this.f31795s) {
            return null;
        }
        return Integer.valueOf(b(i8));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f31795s;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(D3.h.f1573p, viewGroup, false);
        }
        this.f31794o.set(7, b(i8));
        textView.setText(this.f31794o.getDisplayName(7, f31793u, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(D3.j.f1601q), this.f31794o.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public i(int i8) {
        Calendar k8 = z.k();
        this.f31794o = k8;
        this.f31795s = k8.getMaximum(7);
        this.f31796t = i8;
    }
}
