package com.adadapted.android.sdk.core.keyword;

import J6.r;
import g7.b;
import i7.f;
import j7.c;
import j7.d;
import j7.e;
import k7.C6151s0;
import k7.H0;
import k7.K;
import k7.U;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes.dex */
public final class Term$$serializer implements K {
    public static final int $stable = 0;
    public static final Term$$serializer INSTANCE;
    private static final /* synthetic */ C6151s0 descriptor;

    static {
        Term$$serializer term$$serializer = new Term$$serializer();
        INSTANCE = term$$serializer;
        C6151s0 c6151s0 = new C6151s0("com.adadapted.android.sdk.core.keyword.Term", term$$serializer, 6);
        c6151s0.n("term_id", false);
        c6151s0.n("term", false);
        c6151s0.n("replacement", false);
        c6151s0.n("icon", false);
        c6151s0.n("tagline", false);
        c6151s0.n("priority", false);
        descriptor = c6151s0;
    }

    private Term$$serializer() {
    }

    @Override // k7.K
    public b[] childSerializers() {
        H0 h02 = H0.f38618a;
        return new b[]{h02, h02, h02, h02, h02, U.f38656a};
    }

    @Override // g7.a
    public Term deserialize(e eVar) {
        String str;
        int i8;
        String str2;
        String str3;
        String str4;
        String str5;
        int i9;
        r.e(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c d8 = eVar.d(descriptor2);
        if (d8.x()) {
            String z7 = d8.z(descriptor2, 0);
            String z8 = d8.z(descriptor2, 1);
            String z9 = d8.z(descriptor2, 2);
            String z10 = d8.z(descriptor2, 3);
            String z11 = d8.z(descriptor2, 4);
            str = z7;
            i8 = d8.g(descriptor2, 5);
            str2 = z10;
            str3 = z11;
            str4 = z9;
            str5 = z8;
            i9 = 63;
        } else {
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            boolean z12 = true;
            int i10 = 0;
            int i11 = 0;
            while (z12) {
                int e8 = d8.e(descriptor2);
                switch (e8) {
                    case -1:
                        z12 = false;
                        continue;
                    case 0:
                        str6 = d8.z(descriptor2, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        str10 = d8.z(descriptor2, 1);
                        i11 |= 2;
                        break;
                    case 2:
                        str9 = d8.z(descriptor2, 2);
                        i11 |= 4;
                        break;
                    case 3:
                        str7 = d8.z(descriptor2, 3);
                        i11 |= 8;
                        break;
                    case 4:
                        str8 = d8.z(descriptor2, 4);
                        i11 |= 16;
                        break;
                    case 5:
                        i10 = d8.g(descriptor2, 5);
                        i11 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(e8);
                }
            }
            str = str6;
            i8 = i10;
            str2 = str7;
            str3 = str8;
            str4 = str9;
            str5 = str10;
            i9 = i11;
        }
        d8.c(descriptor2);
        return new Term(i9, str, str5, str4, str2, str3, i8, null);
    }

    @Override // g7.b, g7.h, g7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // g7.h
    public void serialize(j7.f fVar, Term term) {
        r.e(fVar, "encoder");
        r.e(term, "value");
        f descriptor2 = getDescriptor();
        d d8 = fVar.d(descriptor2);
        Term.write$Self$advertising_sdk_release(term, d8, descriptor2);
        d8.c(descriptor2);
    }

    @Override // k7.K
    public b[] typeParametersSerializers() {
        return K.a.a(this);
    }
}
