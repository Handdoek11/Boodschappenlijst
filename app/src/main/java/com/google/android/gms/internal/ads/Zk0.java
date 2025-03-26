package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class Zk0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f20534a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Qo0 f20535b = Qo0.f18535b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20536c = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        Iterator it = this.f20534a.iterator();
        while (it.hasNext()) {
            ((Xk0) it.next()).f20123a = false;
        }
    }

    public final Zk0 a(Xk0 xk0) {
        if (xk0.f20128f != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (xk0.f20123a) {
            d();
        }
        xk0.f20128f = this;
        this.f20534a.add(xk0);
        return this;
    }

    public final C2328cl0 b() {
        int i8;
        int i9;
        if (this.f20536c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c8 = 1;
        this.f20536c = true;
        List list = this.f20534a;
        C4518ws0 d02 = As0.d0();
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = this.f20534a;
        int i10 = 0;
        int i11 = 0;
        while (i11 < list2.size() - 1) {
            int i12 = i11 + 1;
            if (((Xk0) list2.get(i11)).f20127e == Yk0.f20310a && ((Xk0) list2.get(i12)).f20127e != Yk0.f20310a) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i11 = i12;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (Xk0 xk0 : this.f20534a) {
            Uk0 unused = xk0.f20124b;
            if (xk0.f20127e == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i13 = 4;
            if (xk0.f20127e == Yk0.f20310a) {
                i8 = i10;
                while (true) {
                    if (i8 != 0 && !hashSet.contains(Integer.valueOf(i8))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[i13];
                    int i14 = i10;
                    while (i14 == 0) {
                        secureRandom.nextBytes(bArr);
                        i14 = ((bArr[2] & 255) << 8) | ((bArr[i10] & 255) << 24) | ((bArr[c8] & 255) << 16) | (bArr[3] & 255);
                        i10 = 0;
                        i13 = 4;
                    }
                    i8 = i14;
                }
            } else {
                Yk0 unused2 = xk0.f20127e;
                i8 = 0;
            }
            Integer valueOf = Integer.valueOf(i8);
            if (hashSet.contains(valueOf)) {
                throw new GeneralSecurityException("Id " + i8 + " is used twice in the keyset");
            }
            hashSet.add(valueOf);
            Xk0.a(xk0);
            Sk0 a8 = C2336cp0.b().a(xk0.f20126d, c8 != xk0.f20126d.a() ? null : valueOf);
            C2111al0 c2111al0 = new C2111al0(a8, xk0.f20124b, i8, xk0.f20123a, null);
            Uk0 uk0 = xk0.f20124b;
            Kp0 kp0 = (Kp0) C3423mp0.c().d(a8, Kp0.class, C3197kl0.a());
            Integer f8 = kp0.f();
            if (f8 != null && f8.intValue() != i8) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            Uk0 uk02 = Uk0.f19440b;
            if (uk02.equals(uk0)) {
                i9 = 3;
            } else if (Uk0.f19441c.equals(uk0)) {
                i9 = 4;
            } else {
                if (!Uk0.f19442d.equals(uk0)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i9 = 5;
            }
            C4627xs0 d03 = C4736ys0.d0();
            C3320ls0 b02 = C3647os0.b0();
            b02.D(kp0.g());
            b02.E(kp0.e());
            b02.C(kp0.b());
            d03.C(b02);
            d03.F(i9);
            d03.D(i8);
            d03.E(kp0.c());
            d02.C((C4736ys0) d03.x());
            if (xk0.f20123a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (xk0.f20124b != uk02) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = valueOf;
            }
            arrayList.add(c2111al0);
            c8 = 1;
            i10 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        d02.D(num.intValue());
        As0 as0 = (As0) d02.x();
        C2328cl0.h(as0);
        return new C2328cl0(as0, arrayList, this.f20535b, null);
    }
}
