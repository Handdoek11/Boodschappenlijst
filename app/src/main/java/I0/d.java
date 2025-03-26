package I0;

import I6.p;
import J6.AbstractC0650j;
import J6.r;
import androidx.appcompat.app.E;
import java.util.Iterator;
import java.util.List;
import x6.C6916E;
import x6.q;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2966a = new a(null);

    public static final class a {

        /* renamed from: I0.d$a$a, reason: collision with other inner class name */
        static final class C0049a extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: o, reason: collision with root package name */
            int f2967o;

            /* renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f2968s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ List f2969t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0049a(List list, A6.d dVar) {
                super(2, dVar);
                this.f2969t = list;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                C0049a c0049a = new C0049a(this.f2969t, dVar);
                c0049a.f2968s = obj;
                return c0049a;
            }

            @Override // I6.p
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(h hVar, A6.d dVar) {
                return ((C0049a) create(hVar, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = B6.b.e();
                int i8 = this.f2967o;
                if (i8 == 0) {
                    q.b(obj);
                    h hVar = (h) this.f2968s;
                    a aVar = d.f2966a;
                    List list = this.f2969t;
                    this.f2967o = 1;
                    if (aVar.c(list, hVar, this) == e8) {
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

        static final class b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: o, reason: collision with root package name */
            Object f2970o;

            /* renamed from: s, reason: collision with root package name */
            Object f2971s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f2972t;

            /* renamed from: v, reason: collision with root package name */
            int f2974v;

            b(A6.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f2972t = obj;
                this.f2974v |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        static final class c extends kotlin.coroutines.jvm.internal.l implements p {

            /* renamed from: o, reason: collision with root package name */
            Object f2975o;

            /* renamed from: s, reason: collision with root package name */
            Object f2976s;

            /* renamed from: t, reason: collision with root package name */
            Object f2977t;

            /* renamed from: u, reason: collision with root package name */
            int f2978u;

            /* renamed from: v, reason: collision with root package name */
            /* synthetic */ Object f2979v;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ List f2980w;

            /* renamed from: x, reason: collision with root package name */
            final /* synthetic */ List f2981x;

            /* renamed from: I0.d$a$c$a, reason: collision with other inner class name */
            static final class C0050a extends kotlin.coroutines.jvm.internal.l implements I6.l {

                /* renamed from: o, reason: collision with root package name */
                int f2982o;

                C0050a(I0.c cVar, A6.d dVar) {
                    super(1, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final A6.d create(A6.d dVar) {
                    return new C0050a(null, dVar);
                }

                @Override // I6.l
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Object invoke(A6.d dVar) {
                    return ((C0050a) create(dVar)).invokeSuspend(C6916E.f44463a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    B6.b.e();
                    int i8 = this.f2982o;
                    if (i8 == 0) {
                        q.b(obj);
                        this.f2982o = 1;
                        throw null;
                    }
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj);
                    return C6916E.f44463a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(List list, List list2, A6.d dVar) {
                super(2, dVar);
                this.f2980w = list;
                this.f2981x = list2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final A6.d create(Object obj, A6.d dVar) {
                c cVar = new c(this.f2980w, this.f2981x, dVar);
                cVar.f2979v = obj;
                return cVar;
            }

            @Override // I6.p
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, A6.d dVar) {
                return ((c) create(obj, dVar)).invokeSuspend(C6916E.f44463a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                List list;
                Iterator it;
                B6.b.e();
                int i8 = this.f2978u;
                if (i8 == 0) {
                    q.b(obj);
                    obj = this.f2979v;
                    List list2 = this.f2980w;
                    list = this.f2981x;
                    it = list2.iterator();
                } else if (i8 == 1) {
                    Object obj2 = this.f2977t;
                    E.a(this.f2976s);
                    Iterator it2 = (Iterator) this.f2975o;
                    List list3 = (List) this.f2979v;
                    q.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C0050a(null, null));
                        this.f2979v = list3;
                        this.f2975o = it2;
                        this.f2976s = null;
                        this.f2977t = null;
                        this.f2978u = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f2975o;
                    list = (List) this.f2979v;
                    q.b(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                E.a(it.next());
                this.f2979v = list;
                this.f2975o = it;
                this.f2976s = null;
                this.f2977t = obj;
                this.f2978u = 1;
                throw null;
            }
        }

        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.util.List r7, I0.h r8, A6.d r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof I0.d.a.b
                if (r0 == 0) goto L13
                r0 = r9
                I0.d$a$b r0 = (I0.d.a.b) r0
                int r1 = r0.f2974v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f2974v = r1
                goto L18
            L13:
                I0.d$a$b r0 = new I0.d$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f2972t
                java.lang.Object r1 = B6.b.e()
                int r2 = r0.f2974v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f2971s
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f2970o
                J6.G r8 = (J6.G) r8
                x6.q.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f2970o
                java.util.List r7 = (java.util.List) r7
                x6.q.b(r9)
                goto L60
            L46:
                x6.q.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                I0.d$a$c r2 = new I0.d$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f2970o = r9
                r0.f2974v = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                J6.G r8 = new J6.G
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L96
                java.lang.Object r9 = r7.next()
                I6.l r9 = (I6.l) r9
                r0.f2970o = r8     // Catch: java.lang.Throwable -> L34
                r0.f2971s = r7     // Catch: java.lang.Throwable -> L34
                r0.f2974v = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
                return r1
            L84:
                java.lang.Object r2 = r8.f3547o
                if (r2 != 0) goto L8b
                r8.f3547o = r9
                goto L6b
            L8b:
                J6.r.b(r2)
                java.lang.Object r2 = r8.f3547o
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                x6.AbstractC6923e.a(r2, r9)
                goto L6b
            L96:
                java.lang.Object r7 = r8.f3547o
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9f
                x6.E r7 = x6.C6916E.f44463a
                return r7
            L9f:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.d.a.c(java.util.List, I0.h, A6.d):java.lang.Object");
        }

        public final p b(List list) {
            r.e(list, "migrations");
            return new C0049a(list, null);
        }

        private a() {
        }
    }
}
