package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.lD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3254lD0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C3254lD0 f24287c = new C3254lD0(AbstractC4169th0.x(C2276cD0.f21105d));

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC4169th0 f24288d = AbstractC4169th0.C(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    static final AbstractC4496wh0 f24289e;

    /* renamed from: a, reason: collision with root package name */
    private final SparseArray f24290a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private final int f24291b;

    static {
        C4387vh0 c4387vh0 = new C4387vh0();
        c4387vh0.a(5, 6);
        c4387vh0.a(17, 6);
        c4387vh0.a(7, 6);
        c4387vh0.a(30, 10);
        c4387vh0.a(18, 6);
        c4387vh0.a(6, 8);
        c4387vh0.a(8, 8);
        c4387vh0.a(14, 8);
        f24289e = c4387vh0.c();
    }

    private C3254lD0(List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            C2276cD0 c2276cD0 = (C2276cD0) list.get(i8);
            this.f24290a.put(c2276cD0.f21106a, c2276cD0);
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.f24290a.size(); i10++) {
            i9 = Math.max(i9, ((C2276cD0) this.f24290a.valueAt(i10)).f21107b);
        }
        this.f24291b = i9;
    }

    static Uri a() {
        if (f()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    static C3254lD0 c(Context context, WR wr, C3907rD0 c3907rD0) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), wr, c3907rD0);
    }

    static C3254lD0 d(Context context, Intent intent, WR wr, C3907rD0 c3907rD0) {
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (c3907rD0 == null) {
            C3907rD0 c3907rD02 = null;
            if (AbstractC2301cW.f21206a >= 33) {
                try {
                    List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(wr.a().f18545a);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        c3907rD02 = new C3907rD0((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
            c3907rD0 = c3907rD02;
        }
        int i8 = AbstractC2301cW.f21206a;
        if (i8 >= 33 && (AbstractC2301cW.m(context) || AbstractC2301cW.i(context))) {
            List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(wr.a().f18545a);
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(AbstractC1943Xi0.g(12)));
            for (int i9 = 0; i9 < directProfilesForAttributes.size(); i9++) {
                AudioProfile a8 = AbstractC2602fD0.a(directProfilesForAttributes.get(i9));
                if (a8.getEncapsulationType() != 1) {
                    int format = a8.getFormat();
                    if (AbstractC2301cW.j(format) || f24289e.containsKey(Integer.valueOf(format))) {
                        Integer valueOf = Integer.valueOf(format);
                        if (hashMap.containsKey(valueOf)) {
                            Set set = (Set) hashMap.get(valueOf);
                            set.getClass();
                            set.addAll(AbstractC1943Xi0.g(a8.getChannelMasks()));
                        } else {
                            hashMap.put(valueOf, new HashSet(AbstractC1943Xi0.g(a8.getChannelMasks())));
                        }
                    }
                }
            }
            C3843qh0 c3843qh0 = new C3843qh0();
            for (Map.Entry entry : hashMap.entrySet()) {
                c3843qh0.g(new C2276cD0(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new C3254lD0(c3843qh0.j());
        }
        if (i8 >= 23) {
            AudioDeviceInfo[] devices = c3907rD0 == null ? audioManager.getDevices(2) : new AudioDeviceInfo[]{c3907rD0.f26139a};
            C4605xh0 c4605xh0 = new C4605xh0();
            c4605xh0.h(8, 7);
            if (i8 >= 31) {
                c4605xh0.h(26, 27);
            }
            if (i8 >= 33) {
                c4605xh0.g(30);
            }
            AbstractC4714yh0 j8 = c4605xh0.j();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (j8.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return f24287c;
                }
            }
        }
        C4605xh0 c4605xh02 = new C4605xh0();
        c4605xh02.g(2);
        if (AbstractC2301cW.f21206a >= 29 && (AbstractC2301cW.m(context) || AbstractC2301cW.i(context))) {
            C3843qh0 c3843qh02 = new C3843qh0();
            AbstractC4825zi0 j9 = f24289e.keySet().j();
            while (j9.hasNext()) {
                Integer num = (Integer) j9.next();
                int intValue = num.intValue();
                if (AbstractC2301cW.f21206a >= AbstractC2301cW.z(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), wr.a().f18545a)) {
                    c3843qh02.g(num);
                }
            }
            c3843qh02.g(2);
            c4605xh02.i(c3843qh02.j());
            return new C3254lD0(e(AbstractC1943Xi0.h(c4605xh02.j()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z7 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z7 || f()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            c4605xh02.i(f24288d);
        }
        if (intent == null || z7 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C3254lD0(e(AbstractC1943Xi0.h(c4605xh02.j()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            c4605xh02.i(AbstractC1943Xi0.g(intArrayExtra));
        }
        return new C3254lD0(e(AbstractC1943Xi0.h(c4605xh02.j()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static AbstractC4169th0 e(int[] iArr, int i8) {
        C3843qh0 c3843qh0 = new C3843qh0();
        for (int i9 : iArr) {
            c3843qh0.g(new C2276cD0(i9, i8));
        }
        return c3843qh0.j();
    }

    private static boolean f() {
        String str = AbstractC2301cW.f21208c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r0
  0x003a: PHI (r0v3 int) = (r0v2 int), (r0v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair b(com.google.android.gms.internal.ads.D r9, com.google.android.gms.internal.ads.WR r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.f14334o
            r0.getClass()
            java.lang.String r1 = r9.f14330k
            int r0 = com.google.android.gms.internal.ads.AbstractC1650Pc.a(r0, r1)
            com.google.android.gms.internal.ads.wh0 r1 = com.google.android.gms.internal.ads.C3254lD0.f24289e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L19
            goto Lc3
        L19:
            r1 = 7
            r2 = 8
            r3 = 6
            r4 = 18
            if (r0 != r4) goto L2c
            android.util.SparseArray r0 = r8.f24290a
            boolean r0 = com.google.android.gms.internal.ads.AbstractC2301cW.g(r0, r4)
            if (r0 != 0) goto L2b
            r0 = r3
            goto L47
        L2b:
            r0 = r4
        L2c:
            if (r0 != r2) goto L3a
            android.util.SparseArray r0 = r8.f24290a
            boolean r0 = com.google.android.gms.internal.ads.AbstractC2301cW.g(r0, r2)
            if (r0 == 0) goto L38
            r0 = r2
            goto L3a
        L38:
            r0 = r1
            goto L47
        L3a:
            r5 = 30
            if (r0 != r5) goto L47
            android.util.SparseArray r6 = r8.f24290a
            boolean r5 = com.google.android.gms.internal.ads.AbstractC2301cW.g(r6, r5)
            if (r5 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r5 = r8.f24290a
            boolean r5 = com.google.android.gms.internal.ads.AbstractC2301cW.g(r5, r0)
            if (r5 == 0) goto Lc3
            android.util.SparseArray r5 = r8.f24290a
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.cD0 r5 = (com.google.android.gms.internal.ads.C2276cD0) r5
            r5.getClass()
            int r6 = r9.f14311D
            r7 = -1
            if (r6 == r7) goto L7e
            if (r0 != r4) goto L62
            goto L7e
        L62:
            java.lang.String r9 = r9.f14334o
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L77
            int r9 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            r10 = 33
            if (r9 >= r10) goto L77
            r9 = 10
            if (r6 <= r9) goto L89
            goto Lc3
        L77:
            boolean r9 = r5.b(r6)
            if (r9 != 0) goto L89
            goto Lc3
        L7e:
            int r9 = r9.f14312E
            if (r9 != r7) goto L85
            r9 = 48000(0xbb80, float:6.7262E-41)
        L85:
            int r6 = r5.a(r9, r10)
        L89:
            int r9 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            r10 = 28
            if (r9 > r10) goto L9d
            if (r6 != r1) goto L92
            goto L9e
        L92:
            r10 = 3
            if (r6 == r10) goto L9b
            r10 = 4
            if (r6 == r10) goto L9b
            r10 = 5
            if (r6 != r10) goto L9d
        L9b:
            r2 = r3
            goto L9e
        L9d:
            r2 = r6
        L9e:
            r10 = 26
            if (r9 > r10) goto Lb0
            java.lang.String r9 = "fugu"
            java.lang.String r10 = com.google.android.gms.internal.ads.AbstractC2301cW.f21207b
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb0
            r9 = 1
            if (r2 != r9) goto Lb0
            r2 = 2
        Lb0:
            int r9 = com.google.android.gms.internal.ads.AbstractC2301cW.A(r2)
            if (r9 == 0) goto Lc3
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        Lc3:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3254lD0.b(com.google.android.gms.internal.ads.D, com.google.android.gms.internal.ads.WR):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.C3254lD0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.lD0 r9 = (com.google.android.gms.internal.ads.C3254lD0) r9
            android.util.SparseArray r1 = r8.f24290a
            android.util.SparseArray r3 = r9.f24290a
            int r4 = com.google.android.gms.internal.ads.AbstractC2301cW.f21206a
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = com.google.android.gms.internal.ads.AbstractC3036jD0.a(r1, r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = r2
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = j$.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.f24291b
            int r9 = r9.f24291b
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3254lD0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i8;
        int i9 = AbstractC2301cW.f21206a;
        SparseArray sparseArray = this.f24290a;
        if (i9 >= 31) {
            i8 = sparseArray.contentHashCode();
        } else {
            int i10 = 17;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                i10 = (((i10 * 31) + sparseArray.keyAt(i11)) * 31) + Objects.hashCode(sparseArray.valueAt(i11));
            }
            i8 = i10;
        }
        return this.f24291b + (i8 * 31);
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f24291b + ", audioProfiles=" + this.f24290a.toString() + "]";
    }
}
