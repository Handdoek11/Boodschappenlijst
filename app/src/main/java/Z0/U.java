package z0;

import android.view.MotionEvent;

/* loaded from: classes.dex */
class U {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f44694a = new float[20];

    /* renamed from: b, reason: collision with root package name */
    private final long[] f44695b = new long[20];

    /* renamed from: c, reason: collision with root package name */
    private float f44696c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private int f44697d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f44698e = 0;

    U() {
    }

    private void b() {
        this.f44697d = 0;
        this.f44696c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j8;
        int i8 = this.f44697d;
        if (i8 < 2) {
            return 0.0f;
        }
        int i9 = this.f44698e;
        int i10 = ((i9 + 20) - (i8 - 1)) % 20;
        long j9 = this.f44695b[i9];
        while (true) {
            jArr = this.f44695b;
            j8 = jArr[i10];
            if (j9 - j8 <= 100) {
                break;
            }
            this.f44697d--;
            i10 = (i10 + 1) % 20;
        }
        int i11 = this.f44697d;
        if (i11 < 2) {
            return 0.0f;
        }
        if (i11 == 2) {
            int i12 = (i10 + 1) % 20;
            if (j8 == jArr[i12]) {
                return 0.0f;
            }
            return this.f44694a[i12] / (r2 - j8);
        }
        float f8 = 0.0f;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f44697d - 1; i14++) {
            int i15 = i14 + i10;
            long[] jArr2 = this.f44695b;
            long j10 = jArr2[i15 % 20];
            int i16 = (i15 + 1) % 20;
            if (jArr2[i16] != j10) {
                i13++;
                float f9 = f(f8);
                float f10 = this.f44694a[i16] / (this.f44695b[i16] - j10);
                f8 += (f10 - f9) * Math.abs(f10);
                if (i13 == 1) {
                    f8 *= 0.5f;
                }
            }
        }
        return f(f8);
    }

    private static float f(float f8) {
        return (f8 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f8) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f44697d != 0 && eventTime - this.f44695b[this.f44698e] > 40) {
            b();
        }
        int i8 = (this.f44698e + 1) % 20;
        this.f44698e = i8;
        int i9 = this.f44697d;
        if (i9 != 20) {
            this.f44697d = i9 + 1;
        }
        this.f44694a[i8] = motionEvent.getAxisValue(26);
        this.f44695b[this.f44698e] = eventTime;
    }

    void c(int i8, float f8) {
        float e8 = e() * i8;
        this.f44696c = e8;
        if (e8 < (-Math.abs(f8))) {
            this.f44696c = -Math.abs(f8);
        } else if (this.f44696c > Math.abs(f8)) {
            this.f44696c = Math.abs(f8);
        }
    }

    float d(int i8) {
        if (i8 != 26) {
            return 0.0f;
        }
        return this.f44696c;
    }
}
