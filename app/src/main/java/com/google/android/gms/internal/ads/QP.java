package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public final class QP extends AbstractC2206be0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18456a;

    /* renamed from: b, reason: collision with root package name */
    private SensorManager f18457b;

    /* renamed from: c, reason: collision with root package name */
    private Sensor f18458c;

    /* renamed from: d, reason: collision with root package name */
    private long f18459d;

    /* renamed from: e, reason: collision with root package name */
    private int f18460e;

    /* renamed from: f, reason: collision with root package name */
    private PP f18461f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18462g;

    QP(Context context) {
        super("ShakeDetector", "ads");
        this.f18456a = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2206be0
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.S8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f8 = fArr[0] / 9.80665f;
            float f9 = fArr[1] / 9.80665f;
            float f10 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f8 * f8) + (f9 * f9) + (f10 * f10))) >= ((Float) D2.A.c().a(AbstractC3184kf.T8)).floatValue()) {
                long a8 = C2.v.c().a();
                if (this.f18459d + ((Integer) D2.A.c().a(AbstractC3184kf.U8)).intValue() <= a8) {
                    if (this.f18459d + ((Integer) D2.A.c().a(AbstractC3184kf.V8)).intValue() < a8) {
                        this.f18460e = 0;
                    }
                    AbstractC0608p0.k("Shake detected.");
                    this.f18459d = a8;
                    int i8 = this.f18460e + 1;
                    this.f18460e = i8;
                    PP pp = this.f18461f;
                    if (pp != null) {
                        if (i8 == ((Integer) D2.A.c().a(AbstractC3184kf.W8)).intValue()) {
                            C3490nP c3490nP = (C3490nP) pp;
                            c3490nP.i(new BinderC3163kP(c3490nP), EnumC3381mP.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (this.f18462g) {
                    SensorManager sensorManager = this.f18457b;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f18458c);
                        AbstractC0608p0.k("Stopped listening for shake gestures.");
                    }
                    this.f18462g = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) D2.A.c().a(AbstractC3184kf.S8)).booleanValue()) {
                    if (this.f18457b == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f18456a.getSystemService("sensor");
                        this.f18457b = sensorManager2;
                        if (sensorManager2 == null) {
                            H2.p.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f18458c = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f18462g && (sensorManager = this.f18457b) != null && (sensor = this.f18458c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f18459d = C2.v.c().a() - ((Integer) D2.A.c().a(AbstractC3184kf.U8)).intValue();
                        this.f18462g = true;
                        AbstractC0608p0.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(PP pp) {
        this.f18461f = pp;
    }
}
