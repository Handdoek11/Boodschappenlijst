package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: com.google.android.gms.internal.ads.nY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3499nY implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3014j20 f24986a;

    /* renamed from: b, reason: collision with root package name */
    private final L60 f24987b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f24988c;

    /* renamed from: d, reason: collision with root package name */
    private final C1175Bq f24989d;

    C3499nY(C4153tZ c4153tZ, L60 l60, Context context, C1175Bq c1175Bq) {
        this.f24986a = c4153tZ;
        this.f24987b = l60;
        this.f24988c = context;
        this.f24989d = c1175Bq;
    }

    final /* synthetic */ C3608oY a(C4103t20 c4103t20) {
        String str;
        boolean z7;
        String str2;
        float f8;
        int i8;
        int i9;
        int i10;
        DisplayMetrics displayMetrics;
        D2.c2 c2Var = this.f24987b.f16767e;
        D2.c2[] c2VarArr = c2Var.f1227x;
        if (c2VarArr != null) {
            str = null;
            boolean z8 = false;
            boolean z9 = false;
            z7 = false;
            for (D2.c2 c2Var2 : c2VarArr) {
                boolean z10 = c2Var2.f1229z;
                if (!z10 && !z8) {
                    str = c2Var2.f1221o;
                    z8 = true;
                }
                if (z10) {
                    if (z9) {
                        z9 = true;
                    } else {
                        z9 = true;
                        z7 = true;
                    }
                }
                if (z8 && z9) {
                    break;
                }
            }
        } else {
            str = c2Var.f1221o;
            z7 = c2Var.f1229z;
        }
        Resources resources = this.f24988c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f8 = 0.0f;
            i8 = 0;
            i9 = 0;
        } else {
            C1175Bq c1175Bq = this.f24989d;
            f8 = displayMetrics.density;
            i9 = displayMetrics.widthPixels;
            i8 = displayMetrics.heightPixels;
            str2 = c1175Bq.j().h();
        }
        StringBuilder sb = new StringBuilder();
        D2.c2[] c2VarArr2 = c2Var.f1227x;
        if (c2VarArr2 != null) {
            boolean z11 = false;
            for (D2.c2 c2Var3 : c2VarArr2) {
                if (c2Var3.f1229z) {
                    z11 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i11 = c2Var3.f1225v;
                    if (i11 == -1) {
                        i11 = f8 != 0.0f ? (int) (c2Var3.f1226w / f8) : -1;
                    }
                    sb.append(i11);
                    sb.append("x");
                    int i12 = c2Var3.f1222s;
                    if (i12 == -2) {
                        i12 = f8 != 0.0f ? (int) (c2Var3.f1223t / f8) : -2;
                    }
                    sb.append(i12);
                }
            }
            if (z11) {
                if (sb.length() != 0) {
                    i10 = 0;
                    sb.insert(0, "|");
                } else {
                    i10 = 0;
                }
                sb.insert(i10, "320x50");
            }
        }
        return new C3608oY(c2Var, str, z7, sb.toString(), f8, i9, i8, str2, this.f24987b.f16779q);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return AbstractC2326ck0.m(this.f24986a.zzb(), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.mY
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return this.f24532a.a((C4103t20) obj);
            }
        }, AbstractC1497Kq.f16650g);
    }
}
