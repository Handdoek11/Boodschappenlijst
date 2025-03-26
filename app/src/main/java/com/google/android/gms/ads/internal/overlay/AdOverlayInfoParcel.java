package com.google.android.gms.ads.internal.overlay;

import C2.l;
import C2.v;
import D2.A;
import D2.InterfaceC0484a;
import F2.InterfaceC0572d;
import F2.z;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.AbstractC1497Kq;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C4558xC;
import com.google.android.gms.internal.ads.InterfaceC2538ei;
import com.google.android.gms.internal.ads.InterfaceC2756gi;
import com.google.android.gms.internal.ads.InterfaceC3418mn;
import com.google.android.gms.internal.ads.InterfaceC3912rG;
import com.google.android.gms.internal.ads.InterfaceC4410vt;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractC0813a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new a();

    /* renamed from: P, reason: collision with root package name */
    private static final AtomicLong f13068P = new AtomicLong(0);

    /* renamed from: Q, reason: collision with root package name */
    private static final ConcurrentHashMap f13069Q = new ConcurrentHashMap();

    /* renamed from: A, reason: collision with root package name */
    public final int f13070A;

    /* renamed from: B, reason: collision with root package name */
    public final int f13071B;

    /* renamed from: C, reason: collision with root package name */
    public final String f13072C;

    /* renamed from: D, reason: collision with root package name */
    public final H2.a f13073D;

    /* renamed from: E, reason: collision with root package name */
    public final String f13074E;

    /* renamed from: F, reason: collision with root package name */
    public final l f13075F;

    /* renamed from: G, reason: collision with root package name */
    public final InterfaceC2538ei f13076G;

    /* renamed from: H, reason: collision with root package name */
    public final String f13077H;

    /* renamed from: I, reason: collision with root package name */
    public final String f13078I;

    /* renamed from: J, reason: collision with root package name */
    public final String f13079J;

    /* renamed from: K, reason: collision with root package name */
    public final C4558xC f13080K;

    /* renamed from: L, reason: collision with root package name */
    public final InterfaceC3912rG f13081L;

    /* renamed from: M, reason: collision with root package name */
    public final InterfaceC3418mn f13082M;

    /* renamed from: N, reason: collision with root package name */
    public final boolean f13083N;

    /* renamed from: O, reason: collision with root package name */
    public final long f13084O;

    /* renamed from: o, reason: collision with root package name */
    public final F2.l f13085o;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC0484a f13086s;

    /* renamed from: t, reason: collision with root package name */
    public final z f13087t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC4410vt f13088u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC2756gi f13089v;

    /* renamed from: w, reason: collision with root package name */
    public final String f13090w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f13091x;

    /* renamed from: y, reason: collision with root package name */
    public final String f13092y;

    /* renamed from: z, reason: collision with root package name */
    public final InterfaceC0572d f13093z;

    public AdOverlayInfoParcel(InterfaceC0484a interfaceC0484a, z zVar, InterfaceC2538ei interfaceC2538ei, InterfaceC2756gi interfaceC2756gi, InterfaceC0572d interfaceC0572d, InterfaceC4410vt interfaceC4410vt, boolean z7, int i8, String str, H2.a aVar, InterfaceC3912rG interfaceC3912rG, InterfaceC3418mn interfaceC3418mn, boolean z8) {
        this.f13085o = null;
        this.f13086s = interfaceC0484a;
        this.f13087t = zVar;
        this.f13088u = interfaceC4410vt;
        this.f13076G = interfaceC2538ei;
        this.f13089v = interfaceC2756gi;
        this.f13090w = null;
        this.f13091x = z7;
        this.f13092y = null;
        this.f13093z = interfaceC0572d;
        this.f13070A = i8;
        this.f13071B = 3;
        this.f13072C = str;
        this.f13073D = aVar;
        this.f13074E = null;
        this.f13075F = null;
        this.f13077H = null;
        this.f13078I = null;
        this.f13079J = null;
        this.f13080K = null;
        this.f13081L = interfaceC3912rG;
        this.f13082M = interfaceC3418mn;
        this.f13083N = z8;
        this.f13084O = f13068P.getAndIncrement();
    }

    public static AdOverlayInfoParcel A0(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e8) {
            if (!((Boolean) A.c().a(AbstractC3184kf.Mc)).booleanValue()) {
                return null;
            }
            v.s().x(e8, "AdOverlayInfoParcel.getFromIntent");
            return null;
        }
    }

    private static final IBinder C0(Object obj) {
        if (((Boolean) A.c().a(AbstractC3184kf.Mc)).booleanValue()) {
            return null;
        }
        return BinderC5853b.p2(obj).asBinder();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 2, this.f13085o, i8, false);
        AbstractC0814b.l(parcel, 3, C0(this.f13086s), false);
        AbstractC0814b.l(parcel, 4, C0(this.f13087t), false);
        AbstractC0814b.l(parcel, 5, C0(this.f13088u), false);
        AbstractC0814b.l(parcel, 6, C0(this.f13089v), false);
        AbstractC0814b.s(parcel, 7, this.f13090w, false);
        AbstractC0814b.c(parcel, 8, this.f13091x);
        AbstractC0814b.s(parcel, 9, this.f13092y, false);
        AbstractC0814b.l(parcel, 10, C0(this.f13093z), false);
        AbstractC0814b.m(parcel, 11, this.f13070A);
        AbstractC0814b.m(parcel, 12, this.f13071B);
        AbstractC0814b.s(parcel, 13, this.f13072C, false);
        AbstractC0814b.r(parcel, 14, this.f13073D, i8, false);
        AbstractC0814b.s(parcel, 16, this.f13074E, false);
        AbstractC0814b.r(parcel, 17, this.f13075F, i8, false);
        AbstractC0814b.l(parcel, 18, C0(this.f13076G), false);
        AbstractC0814b.s(parcel, 19, this.f13077H, false);
        AbstractC0814b.s(parcel, 24, this.f13078I, false);
        AbstractC0814b.s(parcel, 25, this.f13079J, false);
        AbstractC0814b.l(parcel, 26, C0(this.f13080K), false);
        AbstractC0814b.l(parcel, 27, C0(this.f13081L), false);
        AbstractC0814b.l(parcel, 28, C0(this.f13082M), false);
        AbstractC0814b.c(parcel, 29, this.f13083N);
        AbstractC0814b.p(parcel, 30, this.f13084O);
        AbstractC0814b.b(parcel, a8);
        if (((Boolean) A.c().a(AbstractC3184kf.Mc)).booleanValue()) {
            f13069Q.put(Long.valueOf(this.f13084O), new b(this.f13086s, this.f13087t, this.f13088u, this.f13076G, this.f13089v, this.f13093z, this.f13080K, this.f13081L, this.f13082M, AbstractC1497Kq.f16647d.schedule(new c(this.f13084O), ((Integer) A.c().a(AbstractC3184kf.Oc)).intValue(), TimeUnit.SECONDS)));
        }
    }

    public AdOverlayInfoParcel(InterfaceC0484a interfaceC0484a, z zVar, InterfaceC2538ei interfaceC2538ei, InterfaceC2756gi interfaceC2756gi, InterfaceC0572d interfaceC0572d, InterfaceC4410vt interfaceC4410vt, boolean z7, int i8, String str, String str2, H2.a aVar, InterfaceC3912rG interfaceC3912rG, InterfaceC3418mn interfaceC3418mn) {
        this.f13085o = null;
        this.f13086s = interfaceC0484a;
        this.f13087t = zVar;
        this.f13088u = interfaceC4410vt;
        this.f13076G = interfaceC2538ei;
        this.f13089v = interfaceC2756gi;
        this.f13090w = str2;
        this.f13091x = z7;
        this.f13092y = str;
        this.f13093z = interfaceC0572d;
        this.f13070A = i8;
        this.f13071B = 3;
        this.f13072C = null;
        this.f13073D = aVar;
        this.f13074E = null;
        this.f13075F = null;
        this.f13077H = null;
        this.f13078I = null;
        this.f13079J = null;
        this.f13080K = null;
        this.f13081L = interfaceC3912rG;
        this.f13082M = interfaceC3418mn;
        this.f13083N = false;
        this.f13084O = f13068P.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC0484a interfaceC0484a, z zVar, InterfaceC0572d interfaceC0572d, InterfaceC4410vt interfaceC4410vt, int i8, H2.a aVar, String str, l lVar, String str2, String str3, String str4, C4558xC c4558xC, InterfaceC3418mn interfaceC3418mn, String str5) {
        this.f13085o = null;
        this.f13086s = null;
        this.f13087t = zVar;
        this.f13088u = interfaceC4410vt;
        this.f13076G = null;
        this.f13089v = null;
        this.f13091x = false;
        if (((Boolean) A.c().a(AbstractC3184kf.f23783T0)).booleanValue()) {
            this.f13090w = null;
            this.f13092y = null;
        } else {
            this.f13090w = str2;
            this.f13092y = str3;
        }
        this.f13093z = null;
        this.f13070A = i8;
        this.f13071B = 1;
        this.f13072C = null;
        this.f13073D = aVar;
        this.f13074E = str;
        this.f13075F = lVar;
        this.f13077H = str5;
        this.f13078I = null;
        this.f13079J = str4;
        this.f13080K = c4558xC;
        this.f13081L = null;
        this.f13082M = interfaceC3418mn;
        this.f13083N = false;
        this.f13084O = f13068P.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC0484a interfaceC0484a, z zVar, InterfaceC0572d interfaceC0572d, InterfaceC4410vt interfaceC4410vt, boolean z7, int i8, H2.a aVar, InterfaceC3912rG interfaceC3912rG, InterfaceC3418mn interfaceC3418mn) {
        this.f13085o = null;
        this.f13086s = interfaceC0484a;
        this.f13087t = zVar;
        this.f13088u = interfaceC4410vt;
        this.f13076G = null;
        this.f13089v = null;
        this.f13090w = null;
        this.f13091x = z7;
        this.f13092y = null;
        this.f13093z = interfaceC0572d;
        this.f13070A = i8;
        this.f13071B = 2;
        this.f13072C = null;
        this.f13073D = aVar;
        this.f13074E = null;
        this.f13075F = null;
        this.f13077H = null;
        this.f13078I = null;
        this.f13079J = null;
        this.f13080K = null;
        this.f13081L = interfaceC3912rG;
        this.f13082M = interfaceC3418mn;
        this.f13083N = false;
        this.f13084O = f13068P.getAndIncrement();
    }

    AdOverlayInfoParcel(F2.l lVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z7, String str2, IBinder iBinder5, int i8, int i9, String str3, H2.a aVar, String str4, l lVar2, IBinder iBinder6, String str5, String str6, String str7, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, boolean z8, long j8) {
        this.f13085o = lVar;
        this.f13090w = str;
        this.f13091x = z7;
        this.f13092y = str2;
        this.f13070A = i8;
        this.f13071B = i9;
        this.f13072C = str3;
        this.f13073D = aVar;
        this.f13074E = str4;
        this.f13075F = lVar2;
        this.f13077H = str5;
        this.f13078I = str6;
        this.f13079J = str7;
        this.f13083N = z8;
        this.f13084O = j8;
        if (((Boolean) A.c().a(AbstractC3184kf.Mc)).booleanValue()) {
            b bVar = (b) f13069Q.remove(Long.valueOf(j8));
            if (bVar != null) {
                this.f13086s = bVar.f13094a;
                this.f13087t = bVar.f13095b;
                this.f13088u = bVar.f13096c;
                this.f13076G = bVar.f13097d;
                this.f13089v = bVar.f13098e;
                this.f13080K = bVar.f13100g;
                this.f13081L = bVar.f13101h;
                this.f13082M = bVar.f13102i;
                this.f13093z = bVar.f13099f;
                bVar.f13103j.cancel(false);
                return;
            }
            throw new NullPointerException("AdOverlayObjects is null");
        }
        this.f13086s = (InterfaceC0484a) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder));
        this.f13087t = (z) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder2));
        this.f13088u = (InterfaceC4410vt) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder3));
        this.f13076G = (InterfaceC2538ei) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder6));
        this.f13089v = (InterfaceC2756gi) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder4));
        this.f13093z = (InterfaceC0572d) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder5));
        this.f13080K = (C4558xC) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder7));
        this.f13081L = (InterfaceC3912rG) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder8));
        this.f13082M = (InterfaceC3418mn) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder9));
    }

    public AdOverlayInfoParcel(F2.l lVar, InterfaceC0484a interfaceC0484a, z zVar, InterfaceC0572d interfaceC0572d, H2.a aVar, InterfaceC4410vt interfaceC4410vt, InterfaceC3912rG interfaceC3912rG, String str) {
        this.f13085o = lVar;
        this.f13086s = interfaceC0484a;
        this.f13087t = zVar;
        this.f13088u = interfaceC4410vt;
        this.f13076G = null;
        this.f13089v = null;
        this.f13090w = null;
        this.f13091x = false;
        this.f13092y = null;
        this.f13093z = interfaceC0572d;
        this.f13070A = -1;
        this.f13071B = 4;
        this.f13072C = null;
        this.f13073D = aVar;
        this.f13074E = null;
        this.f13075F = null;
        this.f13077H = str;
        this.f13078I = null;
        this.f13079J = null;
        this.f13080K = null;
        this.f13081L = interfaceC3912rG;
        this.f13082M = null;
        this.f13083N = false;
        this.f13084O = f13068P.getAndIncrement();
    }

    public AdOverlayInfoParcel(z zVar, InterfaceC4410vt interfaceC4410vt, int i8, H2.a aVar) {
        this.f13087t = zVar;
        this.f13088u = interfaceC4410vt;
        this.f13070A = 1;
        this.f13073D = aVar;
        this.f13085o = null;
        this.f13086s = null;
        this.f13076G = null;
        this.f13089v = null;
        this.f13090w = null;
        this.f13091x = false;
        this.f13092y = null;
        this.f13093z = null;
        this.f13071B = 1;
        this.f13072C = null;
        this.f13074E = null;
        this.f13075F = null;
        this.f13077H = null;
        this.f13078I = null;
        this.f13079J = null;
        this.f13080K = null;
        this.f13081L = null;
        this.f13082M = null;
        this.f13083N = false;
        this.f13084O = f13068P.getAndIncrement();
    }

    public AdOverlayInfoParcel(InterfaceC4410vt interfaceC4410vt, H2.a aVar, String str, String str2, int i8, InterfaceC3418mn interfaceC3418mn) {
        this.f13085o = null;
        this.f13086s = null;
        this.f13087t = null;
        this.f13088u = interfaceC4410vt;
        this.f13076G = null;
        this.f13089v = null;
        this.f13090w = null;
        this.f13091x = false;
        this.f13092y = null;
        this.f13093z = null;
        this.f13070A = 14;
        this.f13071B = 5;
        this.f13072C = null;
        this.f13073D = aVar;
        this.f13074E = null;
        this.f13075F = null;
        this.f13077H = str;
        this.f13078I = str2;
        this.f13079J = null;
        this.f13080K = null;
        this.f13081L = null;
        this.f13082M = interfaceC3418mn;
        this.f13083N = false;
        this.f13084O = f13068P.getAndIncrement();
    }
}
