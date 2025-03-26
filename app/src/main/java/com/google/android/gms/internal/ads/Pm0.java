package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class Pm0 extends AbstractC3851ql0 {

    /* renamed from: a, reason: collision with root package name */
    private final Nm0 f18265a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18266b;

    /* renamed from: c, reason: collision with root package name */
    private final Mm0 f18267c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC3851ql0 f18268d;

    /* synthetic */ Pm0(Nm0 nm0, String str, Mm0 mm0, AbstractC3851ql0 abstractC3851ql0, Om0 om0) {
        this.f18265a = nm0;
        this.f18266b = str;
        this.f18267c = mm0;
        this.f18268d = abstractC3851ql0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2763gl0
    public final boolean a() {
        return this.f18265a != Nm0.f17592c;
    }

    public final AbstractC3851ql0 b() {
        return this.f18268d;
    }

    public final Nm0 c() {
        return this.f18265a;
    }

    public final String d() {
        return this.f18266b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pm0)) {
            return false;
        }
        Pm0 pm0 = (Pm0) obj;
        return pm0.f18267c.equals(this.f18267c) && pm0.f18268d.equals(this.f18268d) && pm0.f18266b.equals(this.f18266b) && pm0.f18265a.equals(this.f18265a);
    }

    public final int hashCode() {
        return Objects.hash(Pm0.class, this.f18266b, this.f18267c, this.f18268d, this.f18265a);
    }

    public final String toString() {
        Nm0 nm0 = this.f18265a;
        AbstractC3851ql0 abstractC3851ql0 = this.f18268d;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f18266b + ", dekParsingStrategy: " + String.valueOf(this.f18267c) + ", dekParametersForNewKeys: " + String.valueOf(abstractC3851ql0) + ", variant: " + String.valueOf(nm0) + ")";
    }
}
