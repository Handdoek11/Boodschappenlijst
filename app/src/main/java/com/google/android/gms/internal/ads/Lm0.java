package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class Lm0 {

    /* renamed from: a, reason: collision with root package name */
    private Nm0 f16878a;

    /* renamed from: b, reason: collision with root package name */
    private String f16879b;

    /* renamed from: c, reason: collision with root package name */
    private Mm0 f16880c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC3851ql0 f16881d;

    /* synthetic */ Lm0(Om0 om0) {
    }

    public final Lm0 a(AbstractC3851ql0 abstractC3851ql0) {
        this.f16881d = abstractC3851ql0;
        return this;
    }

    public final Lm0 b(Mm0 mm0) {
        this.f16880c = mm0;
        return this;
    }

    public final Lm0 c(String str) {
        this.f16879b = str;
        return this;
    }

    public final Lm0 d(Nm0 nm0) {
        this.f16878a = nm0;
        return this;
    }

    public final Pm0 e() {
        if (this.f16878a == null) {
            this.f16878a = Nm0.f17592c;
        }
        if (this.f16879b == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        Mm0 mm0 = this.f16880c;
        if (mm0 == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        AbstractC3851ql0 abstractC3851ql0 = this.f16881d;
        if (abstractC3851ql0 == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (abstractC3851ql0.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((mm0.equals(Mm0.f17401b) && (abstractC3851ql0 instanceof C2439dm0)) || ((mm0.equals(Mm0.f17403d) && (abstractC3851ql0 instanceof C4288um0)) || ((mm0.equals(Mm0.f17402c) && (abstractC3851ql0 instanceof C3855qn0)) || ((mm0.equals(Mm0.f17404e) && (abstractC3851ql0 instanceof Hl0)) || ((mm0.equals(Mm0.f17405f) && (abstractC3851ql0 instanceof Rl0)) || (mm0.equals(Mm0.f17406g) && (abstractC3851ql0 instanceof C3635om0))))))) {
            return new Pm0(this.f16878a, this.f16879b, this.f16880c, this.f16881d, null);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + this.f16880c.toString() + " when new keys are picked according to " + String.valueOf(this.f16881d) + ".");
    }
}
