package G2;

import android.content.Context;
import android.media.AudioManager;

/* renamed from: G2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f2616a = false;

    /* renamed from: b, reason: collision with root package name */
    private float f2617b = 1.0f;

    public static float b(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume != 0) {
            return streamVolume / streamMaxVolume;
        }
        return 0.0f;
    }

    private final synchronized boolean f() {
        return this.f2617b >= 0.0f;
    }

    public final synchronized float a() {
        if (!f()) {
            return 1.0f;
        }
        return this.f2617b;
    }

    public final synchronized void c(boolean z7) {
        this.f2616a = z7;
    }

    public final synchronized void d(float f8) {
        this.f2617b = f8;
    }

    public final synchronized boolean e() {
        return this.f2616a;
    }
}
