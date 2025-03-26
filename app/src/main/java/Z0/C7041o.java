package z0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: z0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7041o {

    /* renamed from: a, reason: collision with root package name */
    private final Context f44796a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC7043p f44797b;

    /* renamed from: c, reason: collision with root package name */
    private final b f44798c;

    /* renamed from: d, reason: collision with root package name */
    private final a f44799d;

    /* renamed from: e, reason: collision with root package name */
    private VelocityTracker f44800e;

    /* renamed from: f, reason: collision with root package name */
    private float f44801f;

    /* renamed from: g, reason: collision with root package name */
    private int f44802g;

    /* renamed from: h, reason: collision with root package name */
    private int f44803h;

    /* renamed from: i, reason: collision with root package name */
    private int f44804i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f44805j;

    /* renamed from: z0.o$a */
    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i8);
    }

    /* renamed from: z0.o$b */
    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i8);
    }

    public C7041o(Context context, InterfaceC7043p interfaceC7043p) {
        this(context, interfaceC7043p, new b() { // from class: z0.m
            @Override // z0.C7041o.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i8) {
                C7041o.c(context2, iArr, motionEvent, i8);
            }
        }, new a() { // from class: z0.n
            @Override // z0.C7041o.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i8) {
                return C7041o.f(velocityTracker, motionEvent, i8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i8) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = AbstractC7014a0.i(context, viewConfiguration, motionEvent.getDeviceId(), i8, motionEvent.getSource());
        iArr[1] = AbstractC7014a0.h(context, viewConfiguration, motionEvent.getDeviceId(), i8, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i8) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f44803h == source && this.f44804i == deviceId && this.f44802g == i8) {
            return false;
        }
        this.f44798c.a(this.f44796a, this.f44805j, motionEvent, i8);
        this.f44803h = source;
        this.f44804i = deviceId;
        this.f44802g = i8;
        return true;
    }

    private float e(MotionEvent motionEvent, int i8) {
        if (this.f44800e == null) {
            this.f44800e = VelocityTracker.obtain();
        }
        return this.f44799d.a(this.f44800e, motionEvent, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i8) {
        T.a(velocityTracker, motionEvent);
        T.b(velocityTracker, 1000);
        return T.d(velocityTracker, i8);
    }

    public void g(MotionEvent motionEvent, int i8) {
        boolean d8 = d(motionEvent, i8);
        if (this.f44805j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f44800e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f44800e = null;
                return;
            }
            return;
        }
        float e8 = e(motionEvent, i8) * this.f44797b.b();
        float signum = Math.signum(e8);
        if (d8 || (signum != Math.signum(this.f44801f) && signum != 0.0f)) {
            this.f44797b.c();
        }
        float abs = Math.abs(e8);
        int[] iArr = this.f44805j;
        if (abs < iArr[0]) {
            return;
        }
        float max = Math.max(-r6, Math.min(e8, iArr[1]));
        this.f44801f = this.f44797b.a(max) ? max : 0.0f;
    }

    C7041o(Context context, InterfaceC7043p interfaceC7043p, b bVar, a aVar) {
        this.f44802g = -1;
        this.f44803h = -1;
        this.f44804i = -1;
        this.f44805j = new int[]{Integer.MAX_VALUE, 0};
        this.f44796a = context;
        this.f44797b = interfaceC7043p;
        this.f44798c = bVar;
        this.f44799d = aVar;
    }
}
