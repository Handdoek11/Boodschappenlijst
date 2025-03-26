package X0;

import I6.p;
import J6.AbstractC0650j;
import J6.r;
import U6.AbstractC0723k;
import U6.C0706b0;
import U6.M;
import U6.N;
import Z0.n;
import Z0.o;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.google.common.util.concurrent.d;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5880a = new b(null);

    /* renamed from: X0.a$a, reason: collision with other inner class name */
    private static final class C0115a extends a {

        /* renamed from: b, reason: collision with root package name */
        private final n f5881b;

        /* renamed from: X0.a$a$a, reason: collision with other inner class name */
        static final class C0116a extends l implements p {

            /* renamed from: o, reason: collision with root package name */
            int f5882o;

            C0116a(Z0.a aVar, A6.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                return C0115a.this.new C0116a(null, dVar);
            }

            @Override // I6.p
            public final Object invoke(M m8, A6.d dVar) {
                return ((C0116a) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f5882o;
                if (i8 == 0) {
                    q.b(obj);
                    n nVar = C0115a.this.f5881b;
                    this.f5882o = 1;
                    if (nVar.a(null, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                }
                return C6916E.f44463a;
            }
        }

        /* renamed from: X0.a$a$b */
        static final class b extends l implements p {

            /* renamed from: o, reason: collision with root package name */
            int f5884o;

            b(A6.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                return C0115a.this.new b(dVar);
            }

            @Override // I6.p
            public final Object invoke(M m8, A6.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f5884o;
                if (i8 == 0) {
                    q.b(obj);
                    n nVar = C0115a.this.f5881b;
                    this.f5884o = 1;
                    obj = nVar.b(this);
                    if (obj == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                }
                return obj;
            }
        }

        /* renamed from: X0.a$a$c */
        static final class c extends l implements p {

            /* renamed from: o, reason: collision with root package name */
            int f5886o;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ Uri f5888t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ InputEvent f5889u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, A6.d dVar) {
                super(2, dVar);
                this.f5888t = uri;
                this.f5889u = inputEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                return C0115a.this.new c(this.f5888t, this.f5889u, dVar);
            }

            @Override // I6.p
            public final Object invoke(M m8, A6.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f5886o;
                if (i8 == 0) {
                    q.b(obj);
                    n nVar = C0115a.this.f5881b;
                    Uri uri = this.f5888t;
                    InputEvent inputEvent = this.f5889u;
                    this.f5886o = 1;
                    if (nVar.c(uri, inputEvent, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                }
                return C6916E.f44463a;
            }
        }

        /* renamed from: X0.a$a$d */
        static final class d extends l implements p {

            /* renamed from: o, reason: collision with root package name */
            int f5890o;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ Uri f5892t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, A6.d dVar) {
                super(2, dVar);
                this.f5892t = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                return C0115a.this.new d(this.f5892t, dVar);
            }

            @Override // I6.p
            public final Object invoke(M m8, A6.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f5890o;
                if (i8 == 0) {
                    q.b(obj);
                    n nVar = C0115a.this.f5881b;
                    Uri uri = this.f5892t;
                    this.f5890o = 1;
                    if (nVar.d(uri, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                }
                return C6916E.f44463a;
            }
        }

        /* renamed from: X0.a$a$e */
        static final class e extends l implements p {

            /* renamed from: o, reason: collision with root package name */
            int f5893o;

            e(o oVar, A6.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                return C0115a.this.new e(null, dVar);
            }

            @Override // I6.p
            public final Object invoke(M m8, A6.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f5893o;
                if (i8 == 0) {
                    q.b(obj);
                    n nVar = C0115a.this.f5881b;
                    this.f5893o = 1;
                    if (nVar.e(null, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                }
                return C6916E.f44463a;
            }
        }

        /* renamed from: X0.a$a$f */
        static final class f extends l implements p {

            /* renamed from: o, reason: collision with root package name */
            int f5895o;

            f(Z0.p pVar, A6.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                return C0115a.this.new f(null, dVar);
            }

            @Override // I6.p
            public final Object invoke(M m8, A6.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f5895o;
                if (i8 == 0) {
                    q.b(obj);
                    n nVar = C0115a.this.f5881b;
                    this.f5895o = 1;
                    if (nVar.f(null, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                }
                return C6916E.f44463a;
            }
        }

        public C0115a(n nVar) {
            r.e(nVar, "mMeasurementManager");
            this.f5881b = nVar;
        }

        @Override // X0.a
        public com.google.common.util.concurrent.d b() {
            return W0.b.c(AbstractC0723k.b(N.a(C0706b0.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // X0.a
        public com.google.common.util.concurrent.d c(Uri uri, InputEvent inputEvent) {
            r.e(uri, "attributionSource");
            return W0.b.c(AbstractC0723k.b(N.a(C0706b0.a()), null, null, new c(uri, inputEvent, null), 3, null), null, 1, null);
        }

        @Override // X0.a
        public com.google.common.util.concurrent.d d(Uri uri) {
            r.e(uri, "trigger");
            return W0.b.c(AbstractC0723k.b(N.a(C0706b0.a()), null, null, new d(uri, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.d f(Z0.a aVar) {
            r.e(aVar, "deletionRequest");
            return W0.b.c(AbstractC0723k.b(N.a(C0706b0.a()), null, null, new C0116a(aVar, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.d g(o oVar) {
            r.e(oVar, "request");
            return W0.b.c(AbstractC0723k.b(N.a(C0706b0.a()), null, null, new e(oVar, null), 3, null), null, 1, null);
        }

        public com.google.common.util.concurrent.d h(Z0.p pVar) {
            r.e(pVar, "request");
            return W0.b.c(AbstractC0723k.b(N.a(C0706b0.a()), null, null, new f(pVar, null), 3, null), null, 1, null);
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        public final a a(Context context) {
            r.e(context, "context");
            n a8 = n.f6158a.a(context);
            if (a8 != null) {
                return new C0115a(a8);
            }
            return null;
        }

        private b() {
        }
    }

    public static final a a(Context context) {
        return f5880a.a(context);
    }

    public abstract d b();

    public abstract d c(Uri uri, InputEvent inputEvent);

    public abstract d d(Uri uri);
}
