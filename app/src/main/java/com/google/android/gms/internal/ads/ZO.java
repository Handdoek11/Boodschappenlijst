package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public final class ZO extends AbstractC2206be0 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f20463a;

    /* renamed from: b, reason: collision with root package name */
    private final Sensor f20464b;

    /* renamed from: c, reason: collision with root package name */
    private float f20465c;

    /* renamed from: d, reason: collision with root package name */
    private Float f20466d;

    /* renamed from: e, reason: collision with root package name */
    private long f20467e;

    /* renamed from: f, reason: collision with root package name */
    private int f20468f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20469g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f20470h;

    /* renamed from: i, reason: collision with root package name */
    private YO f20471i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f20472j;

    ZO(Context context) {
        super("FlickDetector", "ads");
        this.f20465c = 0.0f;
        this.f20466d = Float.valueOf(0.0f);
        this.f20467e = C2.v.c().a();
        this.f20468f = 0;
        this.f20469g = false;
        this.f20470h = false;
        this.f20471i = null;
        this.f20472j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f20463a = sensorManager;
        if (sensorManager != null) {
            this.f20464b = sensorManager.getDefaultSensor(4);
        } else {
            this.f20464b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2206be0
    public final void a(SensorEvent sensorEvent) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.X8)).booleanValue()) {
            long a8 = C2.v.c().a();
            if (this.f20467e + ((Integer) D2.A.c().a(AbstractC3184kf.Z8)).intValue() < a8) {
                this.f20468f = 0;
                this.f20467e = a8;
                this.f20469g = false;
                this.f20470h = false;
                this.f20465c = this.f20466d.floatValue();
            }
            Float valueOf = Float.valueOf(this.f20466d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f20466d = valueOf;
            float floatValue = valueOf.floatValue();
            float f8 = this.f20465c;
            AbstractC2207bf abstractC2207bf = AbstractC3184kf.Y8;
            if (floatValue > f8 + ((Float) D2.A.c().a(abstractC2207bf)).floatValue()) {
                this.f20465c = this.f20466d.floatValue();
                this.f20470h = true;
            } else if (this.f20466d.floatValue() < this.f20465c - ((Float) D2.A.c().a(abstractC2207bf)).floatValue()) {
                this.f20465c = this.f20466d.floatValue();
                this.f20469g = true;
            }
            if (this.f20466d.isInfinite()) {
                this.f20466d = Float.valueOf(0.0f);
                this.f20465c = 0.0f;
            }
            if (this.f20469g && this.f20470h) {
                AbstractC0608p0.k("Flick detected.");
                this.f20467e = a8;
                int i8 = this.f20468f + 1;
                this.f20468f = i8;
                this.f20469g = false;
                this.f20470h = false;
                YO yo = this.f20471i;
                if (yo != null) {
                    if (i8 == ((Integer) D2.A.c().a(AbstractC3184kf.a9)).intValue()) {
                        C3490nP c3490nP = (C3490nP) yo;
                        c3490nP.i(new BinderC3272lP(c3490nP), EnumC3381mP.GESTURE);
                    }
                }
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f20472j && (sensorManager = this.f20463a) != null && (sensor = this.f20464b) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f20472j = false;
                    AbstractC0608p0.k("Stopped listening for flick gestures.");
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
                if (((Boolean) D2.A.c().a(AbstractC3184kf.X8)).booleanValue()) {
                    if (!this.f20472j && (sensorManager = this.f20463a) != null && (sensor = this.f20464b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f20472j = true;
                        AbstractC0608p0.k("Listening for flick gestures.");
                    }
                    if (this.f20463a == null || this.f20464b == null) {
                        H2.p.g("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(YO yo) {
        this.f20471i = yo;
    }
}
