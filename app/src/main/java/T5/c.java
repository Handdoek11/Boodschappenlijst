package T5;

import I6.q;
import J6.AbstractC0650j;
import J6.L;
import J6.r;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final a f5269e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final List f5270f = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    private final h f5271a;

    /* renamed from: b, reason: collision with root package name */
    private final i f5272b;

    /* renamed from: c, reason: collision with root package name */
    private List f5273c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5274d;

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public c(h hVar, i iVar, List list) {
        r.e(hVar, "phase");
        r.e(iVar, "relation");
        r.e(list, "interceptors");
        this.f5271a = hVar;
        this.f5272b = iVar;
        this.f5273c = list;
        this.f5274d = true;
    }

    private final void d() {
        this.f5273c = c();
        this.f5274d = false;
    }

    public final void a(q qVar) {
        r.e(qVar, "interceptor");
        if (this.f5274d) {
            d();
        }
        this.f5273c.add(qVar);
    }

    public final void b(List list) {
        r.e(list, "destination");
        List list2 = this.f5273c;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + list2.size());
        }
        int size = list2.size();
        for (int i8 = 0; i8 < size; i8++) {
            list.add(list2.get(i8));
        }
    }

    public final List c() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5273c);
        return arrayList;
    }

    public final h e() {
        return this.f5271a;
    }

    public final i f() {
        return this.f5272b;
    }

    public final int g() {
        return this.f5273c.size();
    }

    public final boolean h() {
        return this.f5273c.isEmpty();
    }

    public final List i() {
        this.f5274d = true;
        return this.f5273c;
    }

    public String toString() {
        return "Phase `" + this.f5271a.a() + "`, " + g() + " handlers";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(h hVar, i iVar) {
        r.e(hVar, "phase");
        r.e(iVar, "relation");
        List list = f5270f;
        r.c(list, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Function3<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>{ io.ktor.util.pipeline.PipelineKt.PipelineInterceptorFunction<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent> }>");
        this(hVar, iVar, L.b(list));
        if (!list.isEmpty()) {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }
}
