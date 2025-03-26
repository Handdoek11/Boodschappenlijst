package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.cZ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2304cZ implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f21221a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f21222b;

    public C2304cZ(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Context context) {
        this.f21221a = interfaceExecutorServiceC3522nk0;
        this.f21222b = context;
    }

    final /* synthetic */ C2413dZ a() {
        int i8;
        int i9;
        AudioManager audioManager = (AudioManager) this.f21222b.getSystemService("audio");
        float a8 = C2.v.v().a();
        boolean e8 = C2.v.v().e();
        if (audioManager == null) {
            return new C2413dZ(-1, false, false, -1, -1, -1, -1, -1, a8, e8, true);
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) D2.A.c().a(AbstractC3184kf.Ra)).booleanValue()) {
            int i10 = C2.v.u().i(audioManager);
            i9 = audioManager.getStreamMaxVolume(3);
            i8 = i10;
        } else {
            i8 = -1;
            i9 = -1;
        }
        return new C2413dZ(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i8, i9, audioManager.getRingerMode(), audioManager.getStreamVolume(2), a8, e8, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f21221a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.bZ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f20889o.a();
            }
        });
    }
}
