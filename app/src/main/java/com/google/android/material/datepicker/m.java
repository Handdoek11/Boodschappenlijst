package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.E;

/* loaded from: classes2.dex */
public final class m<S> extends r {

    /* renamed from: u0, reason: collision with root package name */
    private int f31871u0;

    /* renamed from: v0, reason: collision with root package name */
    private C5465a f31872v0;

    class a extends q {
        a() {
        }
    }

    static m f2(d dVar, int i8, C5465a c5465a) {
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i8);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c5465a);
        mVar.R1(bundle);
        return mVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void J0(Bundle bundle) {
        super.J0(bundle);
        if (bundle == null) {
            bundle = x();
        }
        this.f31871u0 = bundle.getInt("THEME_RES_ID_KEY");
        E.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f31872v0 = (C5465a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View N0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(B(), this.f31871u0));
        new a();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void f1(Bundle bundle) {
        super.f1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f31871u0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f31872v0);
    }
}
