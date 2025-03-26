package l5;

import androidx.recyclerview.widget.RecyclerView;
import f5.InterfaceC5792g;
import f5.h;

/* renamed from: l5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC6178d {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(RecyclerView.h hVar, RecyclerView.F f8, int i8) {
        return hVar instanceof InterfaceC5792g ? ((InterfaceC5792g) hVar).t(f8, i8) : hVar.W(f8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(RecyclerView.h hVar, RecyclerView.F f8, int i8) {
        if (hVar instanceof InterfaceC5792g) {
            ((InterfaceC5792g) hVar).r(f8, i8);
        } else {
            hVar.X(f8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(RecyclerView.h hVar, RecyclerView.F f8, int i8) {
        if (hVar instanceof InterfaceC5792g) {
            ((InterfaceC5792g) hVar).f(f8, i8);
        } else {
            hVar.Y(f8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(RecyclerView.h hVar, RecyclerView.F f8, int i8) {
        if (hVar instanceof h) {
            ((h) hVar).p(f8, i8);
        } else {
            hVar.Z(f8);
        }
    }
}
