package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.savedstate.a;
import f1.InterfaceC5764d;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: a, reason: collision with root package name */
    public static final LegacySavedStateHandleController f10247a = new LegacySavedStateHandleController();

    public static final class a implements a.InterfaceC0188a {
        @Override // androidx.savedstate.a.InterfaceC0188a
        public void a(InterfaceC5764d interfaceC5764d) {
            J6.r.e(interfaceC5764d, "owner");
            if (!(interfaceC5764d instanceof L)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            K viewModelStore = ((L) interfaceC5764d).getViewModelStore();
            androidx.savedstate.a savedStateRegistry = interfaceC5764d.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                G b8 = viewModelStore.b((String) it.next());
                J6.r.b(b8);
                LegacySavedStateHandleController.a(b8, savedStateRegistry, interfaceC5764d.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(G g8, androidx.savedstate.a aVar, AbstractC0922h abstractC0922h) {
        J6.r.e(g8, "viewModel");
        J6.r.e(aVar, "registry");
        J6.r.e(abstractC0922h, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) g8.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.c()) {
            return;
        }
        savedStateHandleController.a(aVar, abstractC0922h);
        f10247a.c(aVar, abstractC0922h);
    }

    public static final SavedStateHandleController b(androidx.savedstate.a aVar, AbstractC0922h abstractC0922h, String str, Bundle bundle) {
        J6.r.e(aVar, "registry");
        J6.r.e(abstractC0922h, "lifecycle");
        J6.r.b(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, z.f10346f.a(aVar.b(str), bundle));
        savedStateHandleController.a(aVar, abstractC0922h);
        f10247a.c(aVar, abstractC0922h);
        return savedStateHandleController;
    }

    private final void c(final androidx.savedstate.a aVar, final AbstractC0922h abstractC0922h) {
        AbstractC0922h.b b8 = abstractC0922h.b();
        if (b8 == AbstractC0922h.b.INITIALIZED || b8.c(AbstractC0922h.b.STARTED)) {
            aVar.i(a.class);
        } else {
            abstractC0922h.a(new InterfaceC0925k() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.InterfaceC0925k
                public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar2) {
                    J6.r.e(interfaceC0927m, "source");
                    J6.r.e(aVar2, "event");
                    if (aVar2 == AbstractC0922h.a.ON_START) {
                        abstractC0922h.c(this);
                        aVar.i(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
