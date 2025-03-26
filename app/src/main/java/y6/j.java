package Y6;

import A6.g;
import I6.p;
import J6.r;
import J6.s;
import U6.InterfaceC0745v0;
import Z6.A;

/* loaded from: classes2.dex */
public abstract class j {

    static final class a extends s implements p {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ h f6156o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(2);
            this.f6156o = hVar;
        }

        public final Integer b(int i8, g.b bVar) {
            g.c key = bVar.getKey();
            g.b d8 = this.f6156o.f6149s.d(key);
            if (key != InterfaceC0745v0.f5485d) {
                return Integer.valueOf(bVar != d8 ? Integer.MIN_VALUE : i8 + 1);
            }
            InterfaceC0745v0 interfaceC0745v0 = (InterfaceC0745v0) d8;
            r.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC0745v0 b8 = j.b((InterfaceC0745v0) bVar, interfaceC0745v0);
            if (b8 == interfaceC0745v0) {
                if (interfaceC0745v0 != null) {
                    i8++;
                }
                return Integer.valueOf(i8);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b8 + ", expected child of " + interfaceC0745v0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(h hVar, A6.g gVar) {
        if (((Number) gVar.e(0, new a(hVar))).intValue() == hVar.f6150t) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + hVar.f6149s + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC0745v0 b(InterfaceC0745v0 interfaceC0745v0, InterfaceC0745v0 interfaceC0745v02) {
        while (interfaceC0745v0 != null) {
            if (interfaceC0745v0 == interfaceC0745v02) {
                return interfaceC0745v0;
            }
            if (!(interfaceC0745v0 instanceof A)) {
                return interfaceC0745v0;
            }
            interfaceC0745v0 = interfaceC0745v0.getParent();
        }
        return null;
    }
}
