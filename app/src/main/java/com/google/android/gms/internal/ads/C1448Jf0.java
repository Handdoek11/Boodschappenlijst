package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.Jf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1448Jf0 extends AbstractC1304Ff0 implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    private final Pattern f16287o;

    C1448Jf0(Pattern pattern) {
        pattern.getClass();
        this.f16287o = pattern;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1304Ff0
    public final AbstractC1268Ef0 a(CharSequence charSequence) {
        return new C1412If0(this.f16287o.matcher(charSequence));
    }

    public final String toString() {
        return this.f16287o.toString();
    }
}
