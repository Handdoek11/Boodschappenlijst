package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class V extends T implements U {

    /* renamed from: b0, reason: collision with root package name */
    private static Method f7703b0;

    /* renamed from: a0, reason: collision with root package name */
    private U f7704a0;

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z7) {
            popupWindow.setTouchModal(z7);
        }
    }

    public static class c extends P {

        /* renamed from: E, reason: collision with root package name */
        final int f7705E;

        /* renamed from: F, reason: collision with root package name */
        final int f7706F;

        /* renamed from: G, reason: collision with root package name */
        private U f7707G;

        /* renamed from: H, reason: collision with root package name */
        private MenuItem f7708H;

        public c(Context context, boolean z7) {
            super(context, z7);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f7705E = 21;
                this.f7706F = 22;
            } else {
                this.f7705E = 22;
                this.f7706F = 21;
            }
        }

        @Override // androidx.appcompat.widget.P
        public /* bridge */ /* synthetic */ int d(int i8, int i9, int i10, int i11, int i12) {
            return super.d(i8, i9, i10, i11, i12);
        }

        @Override // androidx.appcompat.widget.P
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i8) {
            return super.e(motionEvent, i8);
        }

        @Override // androidx.appcompat.widget.P, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.P, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.P, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.P, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.P, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int i8;
            int pointToPosition;
            int i9;
            if (this.f7707G != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i8 = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    i8 = 0;
                }
                androidx.appcompat.view.menu.g item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i9 = pointToPosition - i8) < 0 || i9 >= dVar.getCount()) ? null : dVar.getItem(i9);
                MenuItem menuItem = this.f7708H;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e b8 = dVar.b();
                    if (menuItem != null) {
                        this.f7707G.h(b8, menuItem);
                    }
                    this.f7708H = item;
                    if (item != null) {
                        this.f7707G.e(b8, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i8, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i8 == this.f7705E) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i8 != this.f7706F) {
                return super.onKeyDown(i8, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.d) adapter).b().e(false);
            return true;
        }

        @Override // androidx.appcompat.widget.P, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(U u7) {
            this.f7707G = u7;
        }

        @Override // androidx.appcompat.widget.P, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f7703b0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public V(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
    }

    public void S(Object obj) {
        a.a(this.f7630W, (Transition) obj);
    }

    public void T(Object obj) {
        a.b(this.f7630W, (Transition) obj);
    }

    public void U(U u7) {
        this.f7704a0 = u7;
    }

    public void V(boolean z7) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.f7630W, z7);
            return;
        }
        Method method = f7703b0;
        if (method != null) {
            try {
                method.invoke(this.f7630W, Boolean.valueOf(z7));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.U
    public void e(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        U u7 = this.f7704a0;
        if (u7 != null) {
            u7.e(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.U
    public void h(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        U u7 = this.f7704a0;
        if (u7 != null) {
            u7.h(eVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.T
    P s(Context context, boolean z7) {
        c cVar = new c(context, z7);
        cVar.setHoverListener(this);
        return cVar;
    }
}
