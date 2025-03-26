package M2;

import com.google.android.gms.internal.ads.C3533nq;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    private final String f3772a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3773b;

    /* renamed from: c, reason: collision with root package name */
    private final C3533nq f3774c;

    /* synthetic */ B(C0678z c0678z, A a8) {
        this.f3772a = c0678z.f4011a;
        this.f3773b = c0678z.f4012b;
        this.f3774c = c0678z.f4013c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.EnumC2746gd a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f3772a
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            r4 = 3
            switch(r1) {
                case -1999289321: goto L2b;
                case -1372958932: goto L21;
                case 543046670: goto L17;
                case 1951953708: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L35
        Ld:
            java.lang.String r1 = "BANNER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = 0
            goto L36
        L17:
            java.lang.String r1 = "REWARDED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r4
            goto L36
        L21:
            java.lang.String r1 = "INTERSTITIAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r3
            goto L36
        L2b:
            java.lang.String r1 = "NATIVE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r2
            goto L36
        L35:
            r0 = -1
        L36:
            if (r0 == 0) goto L4a
            if (r0 == r3) goto L47
            if (r0 == r2) goto L44
            if (r0 == r4) goto L41
            com.google.android.gms.internal.ads.gd r0 = com.google.android.gms.internal.ads.EnumC2746gd.AD_INITIATER_UNSPECIFIED
            return r0
        L41:
            com.google.android.gms.internal.ads.gd r0 = com.google.android.gms.internal.ads.EnumC2746gd.REWARD_BASED_VIDEO_AD
            return r0
        L44:
            com.google.android.gms.internal.ads.gd r0 = com.google.android.gms.internal.ads.EnumC2746gd.AD_LOADER
            return r0
        L47:
            com.google.android.gms.internal.ads.gd r0 = com.google.android.gms.internal.ads.EnumC2746gd.INTERSTITIAL
            return r0
        L4a:
            com.google.android.gms.internal.ads.gd r0 = com.google.android.gms.internal.ads.EnumC2746gd.BANNER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.B.a():com.google.android.gms.internal.ads.gd");
    }

    final C3533nq b() {
        return this.f3774c;
    }

    public final String c() {
        return this.f3772a.toLowerCase(Locale.ROOT);
    }

    final String d() {
        return this.f3773b;
    }

    public final Set e() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.f3772a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
