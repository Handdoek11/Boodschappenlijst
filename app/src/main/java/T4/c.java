package T4;

import I6.p;
import J6.AbstractC0650j;
import J6.r;
import J6.s;
import R4.C0694b;
import T6.a;
import android.util.Log;
import kotlin.coroutines.jvm.internal.l;
import org.json.JSONObject;
import x6.AbstractC6929k;
import x6.C6916E;
import x6.InterfaceC6928j;
import x6.q;

/* loaded from: classes2.dex */
public final class c implements h {

    /* renamed from: g, reason: collision with root package name */
    private static final a f5198g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final A6.g f5199a;

    /* renamed from: b, reason: collision with root package name */
    private final I4.e f5200b;

    /* renamed from: c, reason: collision with root package name */
    private final C0694b f5201c;

    /* renamed from: d, reason: collision with root package name */
    private final T4.a f5202d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6928j f5203e;

    /* renamed from: f, reason: collision with root package name */
    private final e7.a f5204f;

    private static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    static final class b extends s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ I0.e f5205o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(I0.e eVar) {
            super(0);
            this.f5205o = eVar;
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g(this.f5205o);
        }
    }

    /* renamed from: T4.c$c, reason: collision with other inner class name */
    static final class C0105c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f5206o;

        /* renamed from: s, reason: collision with root package name */
        Object f5207s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5208t;

        /* renamed from: v, reason: collision with root package name */
        int f5210v;

        C0105c(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f5208t = obj;
            this.f5210v |= Integer.MIN_VALUE;
            return c.this.d(this);
        }
    }

    static final class d extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        Object f5211o;

        /* renamed from: s, reason: collision with root package name */
        Object f5212s;

        /* renamed from: t, reason: collision with root package name */
        int f5213t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f5214u;

        d(A6.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            d dVar2 = c.this.new d(dVar);
            dVar2.f5214u = obj;
            return dVar2;
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, A6.d dVar) {
            return ((d) create(jSONObject, dVar)).invokeSuspend(C6916E.f44463a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fb  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0195 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 428
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: T4.c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class e extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        int f5216o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f5217s;

        e(A6.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            e eVar = new e(dVar);
            eVar.f5217s = obj;
            return eVar;
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, A6.d dVar) {
            return ((e) create(str, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            B6.b.e();
            if (this.f5216o != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f5217s));
            return C6916E.f44463a;
        }
    }

    public c(A6.g gVar, I4.e eVar, C0694b c0694b, T4.a aVar, I0.e eVar2) {
        r.e(gVar, "backgroundDispatcher");
        r.e(eVar, "firebaseInstallationsApi");
        r.e(c0694b, "appInfo");
        r.e(aVar, "configsFetcher");
        r.e(eVar2, "dataStore");
        this.f5199a = gVar;
        this.f5200b = eVar;
        this.f5201c = c0694b;
        this.f5202d = aVar;
        this.f5203e = AbstractC6929k.a(new b(eVar2));
        this.f5204f = e7.c.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g f() {
        return (g) this.f5203e.getValue();
    }

    private final String g(String str) {
        return new S6.f("/").b(str, "");
    }

    @Override // T4.h
    public Boolean a() {
        return f().g();
    }

    @Override // T4.h
    public T6.a b() {
        Integer e8 = f().e();
        if (e8 == null) {
            return null;
        }
        a.C0107a c0107a = T6.a.f5296s;
        return T6.a.h(T6.c.s(e8.intValue(), T6.d.f5307v));
    }

    @Override // T4.h
    public Double c() {
        return f().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:46:0x00c1, B:38:0x0097), top: B:64:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cc A[Catch: all -> 0x0162, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0162, blocks: (B:44:0x00b3, B:49:0x00cc, B:36:0x008d, B:41:0x00a2), top: B:62:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    @Override // T4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(A6.d r17) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.c.d(A6.d):java.lang.Object");
    }
}
