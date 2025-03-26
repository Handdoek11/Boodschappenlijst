package androidx.lifecycle;

import androidx.lifecycle.AbstractC0922h;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0925k {

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC0918d f10220o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC0925k f10221s;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10222a;

        static {
            int[] iArr = new int[AbstractC0922h.a.values().length];
            try {
                iArr[AbstractC0922h.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC0922h.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC0922h.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC0922h.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC0922h.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC0922h.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC0922h.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f10222a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(InterfaceC0918d interfaceC0918d, InterfaceC0925k interfaceC0925k) {
        J6.r.e(interfaceC0918d, "defaultLifecycleObserver");
        this.f10220o = interfaceC0918d;
        this.f10221s = interfaceC0925k;
    }

    @Override // androidx.lifecycle.InterfaceC0925k
    public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        J6.r.e(interfaceC0927m, "source");
        J6.r.e(aVar, "event");
        switch (a.f10222a[aVar.ordinal()]) {
            case 1:
                this.f10220o.e(interfaceC0927m);
                break;
            case 2:
                this.f10220o.onStart(interfaceC0927m);
                break;
            case 3:
                this.f10220o.d(interfaceC0927m);
                break;
            case 4:
                this.f10220o.h(interfaceC0927m);
                break;
            case 5:
                this.f10220o.onStop(interfaceC0927m);
                break;
            case 6:
                this.f10220o.onDestroy(interfaceC0927m);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0925k interfaceC0925k = this.f10221s;
        if (interfaceC0925k != null) {
            interfaceC0925k.f(interfaceC0927m, aVar);
        }
    }
}
