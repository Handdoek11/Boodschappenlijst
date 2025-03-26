package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* loaded from: classes.dex */
final class i extends j {
    i(int i8, int i9, Bundle bundle) {
        super(i8, i9, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.j
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new zzt(4, "Invalid response to one way request", null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.j
    final boolean b() {
        return true;
    }
}
