package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.Jr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1463Jr extends AbstractC2206be0 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f16314a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f16315b;

    /* renamed from: c, reason: collision with root package name */
    private final Display f16316c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f16317d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f16318e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f16319f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f16320g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC1428Ir f16321h;

    C1463Jr(Context context) {
        super("OrientationMonitor", "ads");
        this.f16314a = (SensorManager) context.getSystemService("sensor");
        this.f16316c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.f16317d = new float[9];
        this.f16318e = new float[9];
        this.f16315b = new Object();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2206be0
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f16315b) {
            try {
                if (this.f16319f == null) {
                    this.f16319f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f16317d, fArr);
        int rotation = this.f16316c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f16317d, 2, 129, this.f16318e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f16317d, 129, 130, this.f16318e);
        } else if (rotation != 3) {
            System.arraycopy(this.f16317d, 0, this.f16318e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f16317d, 130, 1, this.f16318e);
        }
        float[] fArr2 = this.f16318e;
        float f8 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f8;
        float f9 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f9;
        float f10 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f10;
        synchronized (this.f16315b) {
            System.arraycopy(this.f16318e, 0, this.f16319f, 0, 9);
        }
        InterfaceC1428Ir interfaceC1428Ir = this.f16321h;
        if (interfaceC1428Ir != null) {
            interfaceC1428Ir.zza();
        }
    }

    final void b(InterfaceC1428Ir interfaceC1428Ir) {
        this.f16321h = interfaceC1428Ir;
    }

    final void c() {
        if (this.f16320g != null) {
            return;
        }
        Sensor defaultSensor = this.f16314a.getDefaultSensor(11);
        if (defaultSensor == null) {
            H2.p.d("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        HandlerC1968Yd0 handlerC1968Yd0 = new HandlerC1968Yd0(handlerThread.getLooper());
        this.f16320g = handlerC1968Yd0;
        if (this.f16314a.registerListener(this, defaultSensor, 0, handlerC1968Yd0)) {
            return;
        }
        H2.p.d("SensorManager.registerListener failed.");
        d();
    }

    final void d() {
        if (this.f16320g == null) {
            return;
        }
        this.f16314a.unregisterListener(this);
        this.f16320g.post(new RunnableC1392Hr(this));
        this.f16320g = null;
    }

    final boolean e(float[] fArr) {
        synchronized (this.f16315b) {
            try {
                float[] fArr2 = this.f16319f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
