package f2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5766b {

    /* renamed from: a, reason: collision with root package name */
    private int f35805a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f35806b = 0;

    /* renamed from: c, reason: collision with root package name */
    private final ScaleGestureDetector f35807c;

    /* renamed from: d, reason: collision with root package name */
    private VelocityTracker f35808d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35809e;

    /* renamed from: f, reason: collision with root package name */
    private float f35810f;

    /* renamed from: g, reason: collision with root package name */
    private float f35811g;

    /* renamed from: h, reason: collision with root package name */
    private final float f35812h;

    /* renamed from: i, reason: collision with root package name */
    private final float f35813i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC5767c f35814j;

    C5766b(Context context, InterfaceC5767c interfaceC5767c) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f35813i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f35812h = viewConfiguration.getScaledTouchSlop();
        this.f35814j = interfaceC5767c;
        this.f35807c = new ScaleGestureDetector(context, new a());
    }

    private float b(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.f35806b);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    private float c(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.f35806b);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    private boolean g(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f35805a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f35808d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            this.f35810f = b(motionEvent);
            this.f35811g = c(motionEvent);
            this.f35809e = false;
        } else if (action == 1) {
            this.f35805a = -1;
            if (this.f35809e && this.f35808d != null) {
                this.f35810f = b(motionEvent);
                this.f35811g = c(motionEvent);
                this.f35808d.addMovement(motionEvent);
                this.f35808d.computeCurrentVelocity(1000);
                float xVelocity = this.f35808d.getXVelocity();
                float yVelocity = this.f35808d.getYVelocity();
                if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f35813i) {
                    this.f35814j.b(this.f35810f, this.f35811g, -xVelocity, -yVelocity);
                }
            }
            VelocityTracker velocityTracker = this.f35808d;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f35808d = null;
            }
        } else if (action == 2) {
            float b8 = b(motionEvent);
            float c8 = c(motionEvent);
            float f8 = b8 - this.f35810f;
            float f9 = c8 - this.f35811g;
            if (!this.f35809e) {
                this.f35809e = Math.sqrt((double) ((f8 * f8) + (f9 * f9))) >= ((double) this.f35812h);
            }
            if (this.f35809e) {
                this.f35814j.c(f8, f9);
                this.f35810f = b8;
                this.f35811g = c8;
                VelocityTracker velocityTracker2 = this.f35808d;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
            }
        } else if (action == 3) {
            this.f35805a = -1;
            VelocityTracker velocityTracker3 = this.f35808d;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f35808d = null;
            }
        } else if (action == 6) {
            int b9 = AbstractC5776l.b(motionEvent.getAction());
            if (motionEvent.getPointerId(b9) == this.f35805a) {
                int i8 = b9 == 0 ? 1 : 0;
                this.f35805a = motionEvent.getPointerId(i8);
                this.f35810f = motionEvent.getX(i8);
                this.f35811g = motionEvent.getY(i8);
            }
        }
        int i9 = this.f35805a;
        this.f35806b = motionEvent.findPointerIndex(i9 != -1 ? i9 : 0);
        return true;
    }

    public boolean d() {
        return this.f35809e;
    }

    public boolean e() {
        return this.f35807c.isInProgress();
    }

    public boolean f(MotionEvent motionEvent) {
        try {
            this.f35807c.onTouchEvent(motionEvent);
            return g(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }

    /* renamed from: f2.b$a */
    class a implements ScaleGestureDetector.OnScaleGestureListener {
        a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            if (scaleFactor < 0.0f) {
                return true;
            }
            C5766b.this.f35814j.a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }
}
