package androidx.lifecycle;

import J6.AbstractC0650j;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0922h {

    /* renamed from: a, reason: collision with root package name */
    private AtomicReference f10303a = new AtomicReference();

    /* renamed from: androidx.lifecycle.h$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0171a Companion = new C0171a(null);

        /* renamed from: androidx.lifecycle.h$a$a, reason: collision with other inner class name */
        public static final class C0171a {

            /* renamed from: androidx.lifecycle.h$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0172a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f10304a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f10304a = iArr;
                }
            }

            public /* synthetic */ C0171a(AbstractC0650j abstractC0650j) {
                this();
            }

            public final a a(b bVar) {
                J6.r.e(bVar, "state");
                int i8 = C0172a.f10304a[bVar.ordinal()];
                if (i8 == 1) {
                    return a.ON_DESTROY;
                }
                if (i8 == 2) {
                    return a.ON_STOP;
                }
                if (i8 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b bVar) {
                J6.r.e(bVar, "state");
                int i8 = C0172a.f10304a[bVar.ordinal()];
                if (i8 == 1) {
                    return a.ON_START;
                }
                if (i8 == 2) {
                    return a.ON_RESUME;
                }
                if (i8 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a c(b bVar) {
                J6.r.e(bVar, "state");
                int i8 = C0172a.f10304a[bVar.ordinal()];
                if (i8 == 1) {
                    return a.ON_CREATE;
                }
                if (i8 == 2) {
                    return a.ON_START;
                }
                if (i8 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            private C0171a() {
            }
        }

        /* renamed from: androidx.lifecycle.h$a$b */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f10305a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f10305a = iArr;
            }
        }

        public static final a c(b bVar) {
            return Companion.a(bVar);
        }

        public static final a g(b bVar) {
            return Companion.c(bVar);
        }

        public final b f() {
            switch (b.f10305a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.h$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean c(b bVar) {
            J6.r.e(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    public abstract void a(InterfaceC0926l interfaceC0926l);

    public abstract b b();

    public abstract void c(InterfaceC0926l interfaceC0926l);
}
