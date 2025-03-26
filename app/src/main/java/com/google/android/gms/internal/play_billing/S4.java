package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class S4 extends P4 {

    /* renamed from: y, reason: collision with root package name */
    final /* synthetic */ T4 f29829y;

    S4(T4 t42) {
        this.f29829y = t42;
    }

    @Override // com.google.android.gms.internal.play_billing.P4
    protected final String a() {
        Q4 q42 = (Q4) this.f29829y.f29835o.get();
        if (q42 == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(q42.f29805a) + "]";
    }
}
