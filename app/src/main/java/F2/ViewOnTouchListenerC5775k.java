package f2;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

/* renamed from: f2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnTouchListenerC5775k implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* renamed from: Q, reason: collision with root package name */
    private static float f35816Q = 3.0f;

    /* renamed from: R, reason: collision with root package name */
    private static float f35817R = 1.75f;

    /* renamed from: S, reason: collision with root package name */
    private static float f35818S = 1.0f;

    /* renamed from: T, reason: collision with root package name */
    private static int f35819T = 200;

    /* renamed from: U, reason: collision with root package name */
    private static int f35820U = 1;

    /* renamed from: A, reason: collision with root package name */
    private C5766b f35821A;

    /* renamed from: G, reason: collision with root package name */
    private View.OnClickListener f35827G;

    /* renamed from: H, reason: collision with root package name */
    private View.OnLongClickListener f35828H;

    /* renamed from: I, reason: collision with root package name */
    private InterfaceC5772h f35829I;

    /* renamed from: J, reason: collision with root package name */
    private f f35830J;

    /* renamed from: M, reason: collision with root package name */
    private float f35833M;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f35844y;

    /* renamed from: z, reason: collision with root package name */
    private GestureDetector f35845z;

    /* renamed from: o, reason: collision with root package name */
    private Interpolator f35837o = new AccelerateDecelerateInterpolator();

    /* renamed from: s, reason: collision with root package name */
    private int f35838s = f35819T;

    /* renamed from: t, reason: collision with root package name */
    private float f35839t = f35818S;

    /* renamed from: u, reason: collision with root package name */
    private float f35840u = f35817R;

    /* renamed from: v, reason: collision with root package name */
    private float f35841v = f35816Q;

    /* renamed from: w, reason: collision with root package name */
    private boolean f35842w = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f35843x = false;

    /* renamed from: B, reason: collision with root package name */
    private final Matrix f35822B = new Matrix();

    /* renamed from: C, reason: collision with root package name */
    private final Matrix f35823C = new Matrix();

    /* renamed from: D, reason: collision with root package name */
    private final Matrix f35824D = new Matrix();

    /* renamed from: E, reason: collision with root package name */
    private final RectF f35825E = new RectF();

    /* renamed from: F, reason: collision with root package name */
    private final float[] f35826F = new float[9];

    /* renamed from: K, reason: collision with root package name */
    private int f35831K = 2;

    /* renamed from: L, reason: collision with root package name */
    private int f35832L = 2;

    /* renamed from: N, reason: collision with root package name */
    private boolean f35834N = true;

    /* renamed from: O, reason: collision with root package name */
    private ImageView.ScaleType f35835O = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: P, reason: collision with root package name */
    private InterfaceC5767c f35836P = new a();

    /* renamed from: f2.k$a */
    class a implements InterfaceC5767c {
        a() {
        }

        @Override // f2.InterfaceC5767c
        public void a(float f8, float f9, float f10) {
            if (ViewOnTouchListenerC5775k.this.X() < ViewOnTouchListenerC5775k.this.f35841v || f8 < 1.0f) {
                ViewOnTouchListenerC5775k.n(ViewOnTouchListenerC5775k.this);
                ViewOnTouchListenerC5775k.this.f35824D.postScale(f8, f8, f9, f10);
                ViewOnTouchListenerC5775k.this.L();
            }
        }

        @Override // f2.InterfaceC5767c
        public void b(float f8, float f9, float f10, float f11) {
            ViewOnTouchListenerC5775k viewOnTouchListenerC5775k = ViewOnTouchListenerC5775k.this;
            viewOnTouchListenerC5775k.f35830J = viewOnTouchListenerC5775k.new f(viewOnTouchListenerC5775k.f35844y.getContext());
            f fVar = ViewOnTouchListenerC5775k.this.f35830J;
            ViewOnTouchListenerC5775k viewOnTouchListenerC5775k2 = ViewOnTouchListenerC5775k.this;
            int T7 = viewOnTouchListenerC5775k2.T(viewOnTouchListenerC5775k2.f35844y);
            ViewOnTouchListenerC5775k viewOnTouchListenerC5775k3 = ViewOnTouchListenerC5775k.this;
            fVar.b(T7, viewOnTouchListenerC5775k3.S(viewOnTouchListenerC5775k3.f35844y), (int) f10, (int) f11);
            ViewOnTouchListenerC5775k.this.f35844y.post(ViewOnTouchListenerC5775k.this.f35830J);
        }

        @Override // f2.InterfaceC5767c
        public void c(float f8, float f9) {
            if (ViewOnTouchListenerC5775k.this.f35821A.e()) {
                return;
            }
            ViewOnTouchListenerC5775k.b(ViewOnTouchListenerC5775k.this);
            ViewOnTouchListenerC5775k.this.f35824D.postTranslate(f8, f9);
            ViewOnTouchListenerC5775k.this.L();
            ViewParent parent = ViewOnTouchListenerC5775k.this.f35844y.getParent();
            if (!ViewOnTouchListenerC5775k.this.f35842w || ViewOnTouchListenerC5775k.this.f35821A.e() || ViewOnTouchListenerC5775k.this.f35843x) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((ViewOnTouchListenerC5775k.this.f35831K == 2 || ((ViewOnTouchListenerC5775k.this.f35831K == 0 && f8 >= 1.0f) || ((ViewOnTouchListenerC5775k.this.f35831K == 1 && f8 <= -1.0f) || ((ViewOnTouchListenerC5775k.this.f35832L == 0 && f9 >= 1.0f) || (ViewOnTouchListenerC5775k.this.f35832L == 1 && f9 <= -1.0f))))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* renamed from: f2.k$b */
    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
            if (ViewOnTouchListenerC5775k.this.f35829I == null || ViewOnTouchListenerC5775k.this.X() > ViewOnTouchListenerC5775k.f35818S || motionEvent.getPointerCount() > ViewOnTouchListenerC5775k.f35820U || motionEvent2.getPointerCount() > ViewOnTouchListenerC5775k.f35820U) {
                return false;
            }
            return ViewOnTouchListenerC5775k.this.f35829I.onFling(motionEvent, motionEvent2, f8, f9);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (ViewOnTouchListenerC5775k.this.f35828H != null) {
                ViewOnTouchListenerC5775k.this.f35828H.onLongClick(ViewOnTouchListenerC5775k.this.f35844y);
            }
        }
    }

    /* renamed from: f2.k$c */
    class c implements GestureDetector.OnDoubleTapListener {
        c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float X7 = ViewOnTouchListenerC5775k.this.X();
                float x7 = motionEvent.getX();
                float y7 = motionEvent.getY();
                if (X7 < ViewOnTouchListenerC5775k.this.V()) {
                    ViewOnTouchListenerC5775k viewOnTouchListenerC5775k = ViewOnTouchListenerC5775k.this;
                    viewOnTouchListenerC5775k.t0(viewOnTouchListenerC5775k.V(), x7, y7, true);
                } else if (X7 < ViewOnTouchListenerC5775k.this.V() || X7 >= ViewOnTouchListenerC5775k.this.U()) {
                    ViewOnTouchListenerC5775k viewOnTouchListenerC5775k2 = ViewOnTouchListenerC5775k.this;
                    viewOnTouchListenerC5775k2.t0(viewOnTouchListenerC5775k2.W(), x7, y7, true);
                } else {
                    ViewOnTouchListenerC5775k viewOnTouchListenerC5775k3 = ViewOnTouchListenerC5775k.this;
                    viewOnTouchListenerC5775k3.t0(viewOnTouchListenerC5775k3.U(), x7, y7, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ViewOnTouchListenerC5775k.this.f35827G != null) {
                ViewOnTouchListenerC5775k.this.f35827G.onClick(ViewOnTouchListenerC5775k.this.f35844y);
            }
            RectF N7 = ViewOnTouchListenerC5775k.this.N();
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            ViewOnTouchListenerC5775k.v(ViewOnTouchListenerC5775k.this);
            if (N7 == null) {
                return false;
            }
            if (!N7.contains(x7, y7)) {
                ViewOnTouchListenerC5775k.y(ViewOnTouchListenerC5775k.this);
                return false;
            }
            N7.width();
            N7.height();
            ViewOnTouchListenerC5775k.x(ViewOnTouchListenerC5775k.this);
            return true;
        }
    }

    /* renamed from: f2.k$d */
    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f35849a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f35849a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35849a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35849a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35849a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: f2.k$e */
    private class e implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final float f35850o;

        /* renamed from: s, reason: collision with root package name */
        private final float f35851s;

        /* renamed from: t, reason: collision with root package name */
        private final long f35852t = System.currentTimeMillis();

        /* renamed from: u, reason: collision with root package name */
        private final float f35853u;

        /* renamed from: v, reason: collision with root package name */
        private final float f35854v;

        public e(float f8, float f9, float f10, float f11) {
            this.f35850o = f10;
            this.f35851s = f11;
            this.f35853u = f8;
            this.f35854v = f9;
        }

        private float a() {
            return ViewOnTouchListenerC5775k.this.f35837o.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f35852t) * 1.0f) / ViewOnTouchListenerC5775k.this.f35838s));
        }

        @Override // java.lang.Runnable
        public void run() {
            float a8 = a();
            float f8 = this.f35853u;
            ViewOnTouchListenerC5775k.this.f35836P.a((f8 + ((this.f35854v - f8) * a8)) / ViewOnTouchListenerC5775k.this.X(), this.f35850o, this.f35851s);
            if (a8 < 1.0f) {
                AbstractC5765a.a(ViewOnTouchListenerC5775k.this.f35844y, this);
            }
        }
    }

    /* renamed from: f2.k$f */
    private class f implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final OverScroller f35856o;

        /* renamed from: s, reason: collision with root package name */
        private int f35857s;

        /* renamed from: t, reason: collision with root package name */
        private int f35858t;

        public f(Context context) {
            this.f35856o = new OverScroller(context);
        }

        public void a() {
            this.f35856o.forceFinished(true);
        }

        public void b(int i8, int i9, int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            RectF N7 = ViewOnTouchListenerC5775k.this.N();
            if (N7 == null) {
                return;
            }
            int round = Math.round(-N7.left);
            float f8 = i8;
            if (f8 < N7.width()) {
                i13 = Math.round(N7.width() - f8);
                i12 = 0;
            } else {
                i12 = round;
                i13 = i12;
            }
            int round2 = Math.round(-N7.top);
            float f9 = i9;
            if (f9 < N7.height()) {
                i15 = Math.round(N7.height() - f9);
                i14 = 0;
            } else {
                i14 = round2;
                i15 = i14;
            }
            this.f35857s = round;
            this.f35858t = round2;
            if (round == i13 && round2 == i15) {
                return;
            }
            this.f35856o.fling(round, round2, i10, i11, i12, i13, i14, i15, 0, 0);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f35856o.isFinished() && this.f35856o.computeScrollOffset()) {
                int currX = this.f35856o.getCurrX();
                int currY = this.f35856o.getCurrY();
                ViewOnTouchListenerC5775k.this.f35824D.postTranslate(this.f35857s - currX, this.f35858t - currY);
                ViewOnTouchListenerC5775k.this.L();
                this.f35857s = currX;
                this.f35858t = currY;
                AbstractC5765a.a(ViewOnTouchListenerC5775k.this.f35844y, this);
            }
        }
    }

    public ViewOnTouchListenerC5775k(ImageView imageView) {
        this.f35844y = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f35833M = 0.0f;
        this.f35821A = new C5766b(imageView.getContext(), this.f35836P);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f35845z = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    private void K() {
        f fVar = this.f35830J;
        if (fVar != null) {
            fVar.a();
            this.f35830J = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (M()) {
            c0(P());
        }
    }

    private boolean M() {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        RectF O7 = O(P());
        if (O7 == null) {
            return false;
        }
        float height = O7.height();
        float width = O7.width();
        float S7 = S(this.f35844y);
        float f13 = 0.0f;
        if (height <= S7) {
            int i8 = d.f35849a[this.f35835O.ordinal()];
            if (i8 != 2) {
                if (i8 != 3) {
                    f11 = (S7 - height) / 2.0f;
                    f12 = O7.top;
                } else {
                    f11 = S7 - height;
                    f12 = O7.top;
                }
                f8 = f11 - f12;
            } else {
                f8 = -O7.top;
            }
            this.f35832L = 2;
        } else {
            float f14 = O7.top;
            if (f14 > 0.0f) {
                this.f35832L = 0;
                f8 = -f14;
            } else {
                float f15 = O7.bottom;
                if (f15 < S7) {
                    this.f35832L = 1;
                    f8 = S7 - f15;
                } else {
                    this.f35832L = -1;
                    f8 = 0.0f;
                }
            }
        }
        float T7 = T(this.f35844y);
        if (width <= T7) {
            int i9 = d.f35849a[this.f35835O.ordinal()];
            if (i9 != 2) {
                if (i9 != 3) {
                    f9 = (T7 - width) / 2.0f;
                    f10 = O7.left;
                } else {
                    f9 = T7 - width;
                    f10 = O7.left;
                }
                f13 = f9 - f10;
            } else {
                f13 = -O7.left;
            }
            this.f35831K = 2;
        } else {
            float f16 = O7.left;
            if (f16 > 0.0f) {
                this.f35831K = 0;
                f13 = -f16;
            } else {
                float f17 = O7.right;
                if (f17 < T7) {
                    f13 = T7 - f17;
                    this.f35831K = 1;
                } else {
                    this.f35831K = -1;
                }
            }
        }
        this.f35824D.postTranslate(f13, f8);
        return true;
    }

    private RectF O(Matrix matrix) {
        if (this.f35844y.getDrawable() == null) {
            return null;
        }
        this.f35825E.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrix.mapRect(this.f35825E);
        return this.f35825E;
    }

    private Matrix P() {
        this.f35823C.set(this.f35822B);
        this.f35823C.postConcat(this.f35824D);
        return this.f35823C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int S(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int T(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private float Z(Matrix matrix, int i8) {
        matrix.getValues(this.f35826F);
        return this.f35826F[i8];
    }

    private void a0() {
        this.f35824D.reset();
        q0(this.f35833M);
        c0(P());
        M();
    }

    static /* synthetic */ InterfaceC5773i b(ViewOnTouchListenerC5775k viewOnTouchListenerC5775k) {
        viewOnTouchListenerC5775k.getClass();
        return null;
    }

    private void c0(Matrix matrix) {
        this.f35844y.setImageMatrix(matrix);
    }

    static /* synthetic */ InterfaceC5771g n(ViewOnTouchListenerC5775k viewOnTouchListenerC5775k) {
        viewOnTouchListenerC5775k.getClass();
        return null;
    }

    static /* synthetic */ InterfaceC5774j v(ViewOnTouchListenerC5775k viewOnTouchListenerC5775k) {
        viewOnTouchListenerC5775k.getClass();
        return null;
    }

    static /* synthetic */ InterfaceC5770f x(ViewOnTouchListenerC5775k viewOnTouchListenerC5775k) {
        viewOnTouchListenerC5775k.getClass();
        return null;
    }

    static /* synthetic */ InterfaceC5769e y(ViewOnTouchListenerC5775k viewOnTouchListenerC5775k) {
        viewOnTouchListenerC5775k.getClass();
        return null;
    }

    private void z0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float T7 = T(this.f35844y);
        float S7 = S(this.f35844y);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f35822B.reset();
        float f8 = intrinsicWidth;
        float f9 = T7 / f8;
        float f10 = intrinsicHeight;
        float f11 = S7 / f10;
        ImageView.ScaleType scaleType = this.f35835O;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f35822B.postTranslate((T7 - f8) / 2.0f, (S7 - f10) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f9, f11);
            this.f35822B.postScale(max, max);
            this.f35822B.postTranslate((T7 - (f8 * max)) / 2.0f, (S7 - (f10 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f9, f11));
            this.f35822B.postScale(min, min);
            this.f35822B.postTranslate((T7 - (f8 * min)) / 2.0f, (S7 - (f10 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f8, f10);
            RectF rectF2 = new RectF(0.0f, 0.0f, T7, S7);
            if (((int) this.f35833M) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f10, f8);
            }
            int i8 = d.f35849a[this.f35835O.ordinal()];
            if (i8 == 1) {
                this.f35822B.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i8 == 2) {
                this.f35822B.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i8 == 3) {
                this.f35822B.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i8 == 4) {
                this.f35822B.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        a0();
    }

    public RectF N() {
        M();
        return O(P());
    }

    public Matrix R() {
        return this.f35823C;
    }

    public float U() {
        return this.f35841v;
    }

    public float V() {
        return this.f35840u;
    }

    public float W() {
        return this.f35839t;
    }

    public float X() {
        return (float) Math.sqrt(((float) Math.pow(Z(this.f35824D, 0), 2.0d)) + ((float) Math.pow(Z(this.f35824D, 3), 2.0d)));
    }

    public ImageView.ScaleType Y() {
        return this.f35835O;
    }

    public void b0(boolean z7) {
        this.f35842w = z7;
    }

    public void d0(float f8) {
        AbstractC5776l.a(this.f35839t, this.f35840u, f8);
        this.f35841v = f8;
    }

    public void e0(float f8) {
        AbstractC5776l.a(this.f35839t, f8, this.f35841v);
        this.f35840u = f8;
    }

    public void f0(float f8) {
        AbstractC5776l.a(f8, this.f35840u, this.f35841v);
        this.f35839t = f8;
    }

    public void g0(View.OnClickListener onClickListener) {
        this.f35827G = onClickListener;
    }

    public void h0(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f35845z.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void i0(View.OnLongClickListener onLongClickListener) {
        this.f35828H = onLongClickListener;
    }

    public void n0(InterfaceC5772h interfaceC5772h) {
        this.f35829I = interfaceC5772h;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i8 == i12 && i9 == i13 && i10 == i14 && i11 == i15) {
            return;
        }
        z0(this.f35844y.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f35834N
            r1 = 0
            if (r0 == 0) goto Lbe
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = f2.AbstractC5776l.c(r0)
            if (r0 == 0) goto Lbe
            int r0 = r12.getAction()
            r2 = 1
            if (r0 == 0) goto L6e
            if (r0 == r2) goto L1b
            r3 = 3
            if (r0 == r3) goto L1b
            goto L7a
        L1b:
            float r0 = r10.X()
            float r3 = r10.f35839t
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L44
            android.graphics.RectF r0 = r10.N()
            if (r0 == 0) goto L7a
            f2.k$e r9 = new f2.k$e
            float r5 = r10.X()
            float r6 = r10.f35839t
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L6c
        L44:
            float r0 = r10.X()
            float r3 = r10.f35841v
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L7a
            android.graphics.RectF r0 = r10.N()
            if (r0 == 0) goto L7a
            f2.k$e r9 = new f2.k$e
            float r5 = r10.X()
            float r6 = r10.f35841v
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L6c:
            r11 = r2
            goto L7b
        L6e:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L77
            r11.requestDisallowInterceptTouchEvent(r2)
        L77:
            r10.K()
        L7a:
            r11 = r1
        L7b:
            f2.b r0 = r10.f35821A
            if (r0 == 0) goto Lb2
            boolean r11 = r0.e()
            f2.b r0 = r10.f35821A
            boolean r0 = r0.d()
            f2.b r3 = r10.f35821A
            boolean r3 = r3.f(r12)
            if (r11 != 0) goto L9b
            f2.b r11 = r10.f35821A
            boolean r11 = r11.e()
            if (r11 != 0) goto L9b
            r11 = r2
            goto L9c
        L9b:
            r11 = r1
        L9c:
            if (r0 != 0) goto La8
            f2.b r0 = r10.f35821A
            boolean r0 = r0.d()
            if (r0 != 0) goto La8
            r0 = r2
            goto La9
        La8:
            r0 = r1
        La9:
            if (r11 == 0) goto Lae
            if (r0 == 0) goto Lae
            r1 = r2
        Lae:
            r10.f35843x = r1
            r1 = r3
            goto Lb3
        Lb2:
            r1 = r11
        Lb3:
            android.view.GestureDetector r11 = r10.f35845z
            if (r11 == 0) goto Lbe
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto Lbe
            r1 = r2
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.ViewOnTouchListenerC5775k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void q0(float f8) {
        this.f35824D.postRotate(f8 % 360.0f);
        L();
    }

    public void r0(float f8) {
        this.f35824D.setRotate(f8 % 360.0f);
        L();
    }

    public void s0(float f8) {
        u0(f8, false);
    }

    public void t0(float f8, float f9, float f10, boolean z7) {
        if (f8 < this.f35839t || f8 > this.f35841v) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z7) {
            this.f35844y.post(new e(X(), f8, f9, f10));
        } else {
            this.f35824D.setScale(f8, f8, f9, f10);
            L();
        }
    }

    public void u0(float f8, boolean z7) {
        t0(f8, this.f35844y.getRight() / 2, this.f35844y.getBottom() / 2, z7);
    }

    public void v0(ImageView.ScaleType scaleType) {
        if (!AbstractC5776l.d(scaleType) || scaleType == this.f35835O) {
            return;
        }
        this.f35835O = scaleType;
        y0();
    }

    public void w0(int i8) {
        this.f35838s = i8;
    }

    public void x0(boolean z7) {
        this.f35834N = z7;
        y0();
    }

    public void y0() {
        if (this.f35834N) {
            z0(this.f35844y.getDrawable());
        } else {
            a0();
        }
    }

    public void j0(InterfaceC5768d interfaceC5768d) {
    }

    public void k0(InterfaceC5769e interfaceC5769e) {
    }

    public void l0(InterfaceC5770f interfaceC5770f) {
    }

    public void m0(InterfaceC5771g interfaceC5771g) {
    }

    public void o0(InterfaceC5773i interfaceC5773i) {
    }

    public void p0(InterfaceC5774j interfaceC5774j) {
    }
}
