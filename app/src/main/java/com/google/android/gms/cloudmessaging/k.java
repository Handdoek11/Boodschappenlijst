package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* loaded from: classes.dex */
final class k extends j {
    k(int i8, int i9, Bundle bundle) {
        super(i8, i9, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.j
    final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.j
    final boolean b() {
        return false;
    }
}
