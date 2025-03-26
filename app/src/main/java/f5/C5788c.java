package f5;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* renamed from: f5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5788c extends RecyclerView.j {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f35887a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f35888b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f35889c;

    /* renamed from: f5.c$a */
    public interface a {
        void a(RecyclerView.h hVar, Object obj, int i8, int i9, Object obj2);

        void g(RecyclerView.h hVar, Object obj);

        void j(RecyclerView.h hVar, Object obj, int i8, int i9, int i10);

        void m(RecyclerView.h hVar, Object obj, int i8, int i9);

        void y(RecyclerView.h hVar, Object obj, int i8, int i9);
    }

    public C5788c(a aVar, RecyclerView.h hVar, Object obj) {
        this.f35887a = new WeakReference(aVar);
        this.f35888b = new WeakReference(hVar);
        this.f35889c = obj;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void a() {
        a aVar = (a) this.f35887a.get();
        RecyclerView.h hVar = (RecyclerView.h) this.f35888b.get();
        if (aVar == null || hVar == null) {
            return;
        }
        aVar.g(hVar, this.f35889c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void b(int i8, int i9, Object obj) {
        a aVar = (a) this.f35887a.get();
        RecyclerView.h hVar = (RecyclerView.h) this.f35888b.get();
        if (aVar == null || hVar == null) {
            return;
        }
        aVar.a(hVar, this.f35889c, i8, i9, obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void c(int i8, int i9) {
        a aVar = (a) this.f35887a.get();
        RecyclerView.h hVar = (RecyclerView.h) this.f35888b.get();
        if (aVar == null || hVar == null) {
            return;
        }
        aVar.m(hVar, this.f35889c, i8, i9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void d(int i8, int i9, int i10) {
        a aVar = (a) this.f35887a.get();
        RecyclerView.h hVar = (RecyclerView.h) this.f35888b.get();
        if (aVar == null || hVar == null) {
            return;
        }
        aVar.j(hVar, this.f35889c, i8, i9, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public void e(int i8, int i9) {
        a aVar = (a) this.f35887a.get();
        RecyclerView.h hVar = (RecyclerView.h) this.f35888b.get();
        if (aVar == null || hVar == null) {
            return;
        }
        aVar.y(hVar, this.f35889c, i8, i9);
    }
}
