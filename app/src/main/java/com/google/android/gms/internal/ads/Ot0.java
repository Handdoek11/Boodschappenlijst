package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

/* loaded from: classes.dex */
final class Ot0 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Pt0 f17973a;

    Ot0(Pt0 pt0) {
        this.f17973a = pt0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            Mac mac = (Mac) Bt0.f13913c.a(this.f17973a.f18288b);
            mac.init(this.f17973a.f18289c);
            return mac;
        } catch (GeneralSecurityException e8) {
            throw new IllegalStateException(e8);
        }
    }
}
