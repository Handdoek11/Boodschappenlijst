package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes.dex */
final class w extends v {

    /* renamed from: s, reason: collision with root package name */
    private final byte[] f13429s;

    w(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f13429s = bArr;
    }

    @Override // com.google.android.gms.common.v
    final byte[] p2() {
        return this.f13429s;
    }
}
