package com.adadapted.android.sdk.core.concurrency;

import A6.g;
import I6.p;
import U6.C0706b0;
import U6.InterfaceC0745v0;
import com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope;

/* loaded from: classes.dex */
public final class Transporter implements TransporterCoroutineScope {
    public static final int $stable = 0;

    @Override // com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope
    public InterfaceC0745v0 dispatchToMain(p pVar) {
        return TransporterCoroutineScope.DefaultImpls.dispatchToMain(this, pVar);
    }

    @Override // com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope
    public InterfaceC0745v0 dispatchToThread(p pVar) {
        return TransporterCoroutineScope.DefaultImpls.dispatchToThread(this, pVar);
    }

    @Override // com.adadapted.android.sdk.core.concurrency.TransporterCoroutineScope, U6.M
    public g getCoroutineContext() {
        return C0706b0.a();
    }
}
