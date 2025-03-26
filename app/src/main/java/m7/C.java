package m7;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import x6.AbstractC6920b;
import x6.AbstractC6921c;
import x6.C6916E;
import x6.C6919a;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6227a f39397a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f39398b;

    /* renamed from: c, reason: collision with root package name */
    private int f39399c;

    static final class a extends kotlin.coroutines.jvm.internal.k implements I6.q {

        /* renamed from: s, reason: collision with root package name */
        int f39400s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f39401t;

        a(A6.d dVar) {
            super(3, dVar);
        }

        @Override // I6.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object d(AbstractC6921c abstractC6921c, C6916E c6916e, A6.d dVar) {
            a aVar = C.this.new a(dVar);
            aVar.f39401t = abstractC6921c;
            return aVar.invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f39400s;
            if (i8 == 0) {
                x6.q.b(obj);
                AbstractC6921c abstractC6921c = (AbstractC6921c) this.f39401t;
                byte E7 = C.this.f39397a.E();
                if (E7 == 1) {
                    return C.this.j(true);
                }
                if (E7 == 0) {
                    return C.this.j(false);
                }
                if (E7 != 6) {
                    if (E7 == 8) {
                        return C.this.f();
                    }
                    AbstractC6227a.y(C.this.f39397a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                C c8 = C.this;
                this.f39400s = 1;
                obj = c8.h(abstractC6921c, this);
                if (obj == e8) {
                    return e8;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x6.q.b(obj);
            }
            return (l7.h) obj;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f39403o;

        /* renamed from: s, reason: collision with root package name */
        Object f39404s;

        /* renamed from: t, reason: collision with root package name */
        Object f39405t;

        /* renamed from: u, reason: collision with root package name */
        Object f39406u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f39407v;

        /* renamed from: x, reason: collision with root package name */
        int f39409x;

        b(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39407v = obj;
            this.f39409x |= Integer.MIN_VALUE;
            return C.this.h(null, this);
        }
    }

    public C(l7.f fVar, AbstractC6227a abstractC6227a) {
        J6.r.e(fVar, "configuration");
        J6.r.e(abstractC6227a, "lexer");
        this.f39397a = abstractC6227a;
        this.f39398b = fVar.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l7.h f() {
        byte m8 = this.f39397a.m();
        if (this.f39397a.E() == 4) {
            AbstractC6227a.y(this.f39397a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f39397a.f()) {
            arrayList.add(e());
            m8 = this.f39397a.m();
            if (m8 != 4) {
                AbstractC6227a abstractC6227a = this.f39397a;
                boolean z7 = m8 == 9;
                int i8 = abstractC6227a.f39442a;
                if (!z7) {
                    AbstractC6227a.y(abstractC6227a, "Expected end of the array or comma", i8, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (m8 == 8) {
            this.f39397a.n((byte) 9);
        } else if (m8 == 4) {
            AbstractC6227a.y(this.f39397a, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new l7.b(arrayList);
    }

    private final l7.h g() {
        return (l7.h) AbstractC6920b.b(new C6919a(new a(null)), C6916E.f44463a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(x6.AbstractC6921c r21, A6.d r22) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.C.h(x6.c, A6.d):java.lang.Object");
    }

    private final l7.h i() {
        byte n8 = this.f39397a.n((byte) 6);
        if (this.f39397a.E() == 4) {
            AbstractC6227a.y(this.f39397a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f39397a.f()) {
                break;
            }
            String s8 = this.f39398b ? this.f39397a.s() : this.f39397a.q();
            this.f39397a.n((byte) 5);
            linkedHashMap.put(s8, e());
            n8 = this.f39397a.m();
            if (n8 != 4) {
                if (n8 != 7) {
                    AbstractC6227a.y(this.f39397a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (n8 == 6) {
            this.f39397a.n((byte) 7);
        } else if (n8 == 4) {
            AbstractC6227a.y(this.f39397a, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return new l7.t(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l7.v j(boolean z7) {
        String s8 = (this.f39398b || !z7) ? this.f39397a.s() : this.f39397a.q();
        return (z7 || !J6.r.a(s8, "null")) ? new l7.o(s8, z7) : l7.r.f38869t;
    }

    public final l7.h e() {
        byte E7 = this.f39397a.E();
        if (E7 == 1) {
            return j(true);
        }
        if (E7 == 0) {
            return j(false);
        }
        if (E7 == 6) {
            int i8 = this.f39399c + 1;
            this.f39399c = i8;
            this.f39399c--;
            return i8 == 200 ? g() : i();
        }
        if (E7 == 8) {
            return f();
        }
        AbstractC6227a.y(this.f39397a, "Cannot begin reading element, unexpected token: " + ((int) E7), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
