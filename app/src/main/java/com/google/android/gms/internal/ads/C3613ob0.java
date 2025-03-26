package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: com.google.android.gms.internal.ads.ob0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3613ob0 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25232a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f25233b;

    /* renamed from: c, reason: collision with root package name */
    private float f25234c;

    /* renamed from: d, reason: collision with root package name */
    private final C1116Ab0 f25235d;

    public C3613ob0(Handler handler, Context context, C3395mb0 c3395mb0, C1116Ab0 c1116Ab0) {
        super(handler);
        this.f25232a = context;
        this.f25233b = (AudioManager) context.getSystemService("audio");
        this.f25235d = c1116Ab0;
    }

    private final float c() {
        AudioManager audioManager = this.f25233b;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f8 = streamVolume / streamMaxVolume;
        if (f8 > 1.0f) {
            return 1.0f;
        }
        return f8;
    }

    private final void d() {
        this.f25235d.e(this.f25234c);
    }

    public final void a() {
        this.f25234c = c();
        d();
        this.f25232a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f25232a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        super.onChange(z7);
        float c8 = c();
        if (c8 != this.f25234c) {
            this.f25234c = c8;
            d();
        }
    }
}
