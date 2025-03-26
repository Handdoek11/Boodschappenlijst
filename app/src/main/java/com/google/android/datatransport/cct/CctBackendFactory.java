package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import k2.InterfaceC6098d;
import k2.h;
import k2.m;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC6098d {
    @Override // k2.InterfaceC6098d
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
