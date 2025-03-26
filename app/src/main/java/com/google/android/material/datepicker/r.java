package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
abstract class r extends Fragment {

    /* renamed from: t0, reason: collision with root package name */
    protected final LinkedHashSet f31894t0 = new LinkedHashSet();

    r() {
    }

    boolean d2(q qVar) {
        return this.f31894t0.add(qVar);
    }

    void e2() {
        this.f31894t0.clear();
    }
}
