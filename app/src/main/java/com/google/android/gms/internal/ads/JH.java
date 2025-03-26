package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class JH implements InterfaceC1645Oz {

    /* renamed from: a, reason: collision with root package name */
    private final Map f16215a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f16216b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f16217c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4203ty0 f16218d;

    /* renamed from: e, reason: collision with root package name */
    private final SI f16219e;

    JH(Map map, Map map2, Map map3, InterfaceC4203ty0 interfaceC4203ty0, SI si) {
        this.f16215a = map;
        this.f16216b = map2;
        this.f16217c = map3;
        this.f16218d = interfaceC4203ty0;
        this.f16219e = si;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1645Oz
    public final InterfaceC4474wT g(int i8, String str) {
        InterfaceC4474wT g8;
        InterfaceC4474wT interfaceC4474wT = (InterfaceC4474wT) this.f16215a.get(str);
        if (interfaceC4474wT != null) {
            return interfaceC4474wT;
        }
        if (i8 != 1) {
            if (i8 != 4) {
                return null;
            }
            MU mu = (MU) this.f16217c.get(str);
            if (mu != null) {
                return new C4583xT(mu, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.Qz
                    @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
                    public final Object apply(Object obj) {
                        return new C1820Tz((List) obj);
                    }
                });
            }
            g8 = (InterfaceC4474wT) this.f16216b.get(str);
            if (g8 == null) {
                return null;
            }
        } else if (this.f16219e.e() == null || (g8 = ((InterfaceC1645Oz) this.f16218d.zzb()).g(i8, str)) == null) {
            return null;
        }
        return new C4583xT(g8, new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.Rz
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return new C1820Tz((AbstractC1506Kz) obj);
            }
        });
    }
}
