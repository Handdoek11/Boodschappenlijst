package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3275lS implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f24321a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3384mS f24322b;

    C3275lS(C3384mS c3384mS, boolean z7) {
        this.f24321a = z7;
        this.f24322b = c3384mS;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        H2.p.d("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    @Override // com.google.android.gms.internal.ads.Yj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void c(java.lang.Object r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.mS r0 = r7.f24322b
            com.google.android.gms.internal.ads.KB r8 = (com.google.android.gms.internal.ads.KB) r8
            boolean r0 = r0.a()
            if (r0 == 0) goto Lb
            return
        Lb:
            android.os.Bundle r8 = r8.f16551a
            java.lang.String r0 = "ad_types"
            java.lang.Object r0 = r8.get(r0)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L1a
            java.util.List r0 = (java.util.List) r0
            goto L24
        L1a:
            boolean r1 = r0 instanceof java.lang.String[]
            if (r1 == 0) goto L4a
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
        L24:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L31
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto L31
        L45:
            java.util.List r0 = j$.util.DesugarCollections.unmodifiableList(r1)
            goto L4e
        L4a:
            java.util.List r0 = java.util.Collections.emptyList()
        L4e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L57:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb1
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 2
            r5 = 3
            r6 = 1
            switch(r2) {
                case -1396342996: goto L8c;
                case -1052618729: goto L82;
                case -239580146: goto L78;
                case 604727084: goto L6e;
                default: goto L6d;
            }
        L6d:
            goto L96
        L6e:
            java.lang.String r2 = "interstitial"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            r1 = r6
            goto L97
        L78:
            java.lang.String r2 = "rewarded"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            r1 = r5
            goto L97
        L82:
            java.lang.String r2 = "native"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            r1 = r3
            goto L97
        L8c:
            java.lang.String r2 = "banner"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            r1 = 0
            goto L97
        L96:
            r1 = -1
        L97:
            if (r1 == 0) goto Lab
            if (r1 == r6) goto La8
            if (r1 == r3) goto La5
            if (r1 == r5) goto La2
            com.google.android.gms.internal.ads.qe r1 = com.google.android.gms.internal.ads.EnumC3836qe.AD_FORMAT_TYPE_UNSPECIFIED
            goto Lad
        La2:
            com.google.android.gms.internal.ads.qe r1 = com.google.android.gms.internal.ads.EnumC3836qe.REWARD_BASED_VIDEO_AD
            goto Lad
        La5:
            com.google.android.gms.internal.ads.qe r1 = com.google.android.gms.internal.ads.EnumC3836qe.NATIVE_APP_INSTALL
            goto Lad
        La8:
            com.google.android.gms.internal.ads.qe r1 = com.google.android.gms.internal.ads.EnumC3836qe.INTERSTITIAL
            goto Lad
        Lab:
            com.google.android.gms.internal.ads.qe r1 = com.google.android.gms.internal.ads.EnumC3836qe.BANNER
        Lad:
            r4.add(r1)
            goto L57
        Lb1:
            com.google.android.gms.internal.ads.mS r0 = r7.f24322b
            com.google.android.gms.internal.ads.vd r6 = com.google.android.gms.internal.ads.C3384mS.c(r0, r8)
            com.google.android.gms.internal.ads.mS r0 = r7.f24322b
            com.google.android.gms.internal.ads.pd r5 = com.google.android.gms.internal.ads.C3384mS.b(r0, r8)
            com.google.android.gms.internal.ads.mS r8 = r7.f24322b
            boolean r3 = r7.f24321a
            com.google.android.gms.internal.ads.kS r0 = new com.google.android.gms.internal.ads.kS
            r1 = r0
            r2 = r7
            r1.<init>()
            com.google.android.gms.internal.ads.aS r8 = r8.f24959b
            r8.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3275lS.c(java.lang.Object):void");
    }
}
