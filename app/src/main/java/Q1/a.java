package Q1;

import P1.h;
import P1.m;
import P1.n;
import P1.o;
import P1.r;
import com.bumptech.glide.load.data.j;

/* loaded from: classes.dex */
public class a implements n {

    /* renamed from: b, reason: collision with root package name */
    public static final J1.g f4666b = J1.g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    private final m f4667a;

    /* renamed from: Q1.a$a, reason: collision with other inner class name */
    public static class C0092a implements o {

        /* renamed from: a, reason: collision with root package name */
        private final m f4668a = new m(500);

        @Override // P1.o
        public n d(r rVar) {
            return new a(this.f4668a);
        }
    }

    public a(m mVar) {
        this.f4667a = mVar;
    }

    @Override // P1.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a a(h hVar, int i8, int i9, J1.h hVar2) {
        m mVar = this.f4667a;
        if (mVar != null) {
            h hVar3 = (h) mVar.a(hVar, 0, 0);
            if (hVar3 == null) {
                this.f4667a.b(hVar, 0, 0, hVar);
            } else {
                hVar = hVar3;
            }
        }
        return new n.a(hVar, new j(hVar, ((Integer) hVar2.c(f4666b)).intValue()));
    }

    @Override // P1.n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(h hVar) {
        return true;
    }
}
