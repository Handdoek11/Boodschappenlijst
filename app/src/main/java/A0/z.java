package A0;

import A0.C;
import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.app.E;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import n0.AbstractC6244c;

/* loaded from: classes.dex */
public class z {

    /* renamed from: d, reason: collision with root package name */
    private static int f8d;

    /* renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f9a;

    /* renamed from: b, reason: collision with root package name */
    public int f10b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f11c = -1;

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f12A;

        /* renamed from: B, reason: collision with root package name */
        public static final a f13B;

        /* renamed from: C, reason: collision with root package name */
        public static final a f14C;

        /* renamed from: D, reason: collision with root package name */
        public static final a f15D;

        /* renamed from: E, reason: collision with root package name */
        public static final a f16E;

        /* renamed from: F, reason: collision with root package name */
        public static final a f17F;

        /* renamed from: G, reason: collision with root package name */
        public static final a f18G;

        /* renamed from: H, reason: collision with root package name */
        public static final a f19H;

        /* renamed from: I, reason: collision with root package name */
        public static final a f20I;

        /* renamed from: J, reason: collision with root package name */
        public static final a f21J;

        /* renamed from: K, reason: collision with root package name */
        public static final a f22K;

        /* renamed from: L, reason: collision with root package name */
        public static final a f23L;

        /* renamed from: M, reason: collision with root package name */
        public static final a f24M;

        /* renamed from: N, reason: collision with root package name */
        public static final a f25N;

        /* renamed from: O, reason: collision with root package name */
        public static final a f26O;

        /* renamed from: P, reason: collision with root package name */
        public static final a f27P;

        /* renamed from: Q, reason: collision with root package name */
        public static final a f28Q;

        /* renamed from: R, reason: collision with root package name */
        public static final a f29R;

        /* renamed from: S, reason: collision with root package name */
        public static final a f30S;

        /* renamed from: T, reason: collision with root package name */
        public static final a f31T;

        /* renamed from: U, reason: collision with root package name */
        public static final a f32U;

        /* renamed from: V, reason: collision with root package name */
        public static final a f33V;

        /* renamed from: e, reason: collision with root package name */
        public static final a f34e = new a(1, null);

        /* renamed from: f, reason: collision with root package name */
        public static final a f35f = new a(2, null);

        /* renamed from: g, reason: collision with root package name */
        public static final a f36g = new a(4, null);

        /* renamed from: h, reason: collision with root package name */
        public static final a f37h = new a(8, null);

        /* renamed from: i, reason: collision with root package name */
        public static final a f38i = new a(16, null);

        /* renamed from: j, reason: collision with root package name */
        public static final a f39j = new a(32, null);

        /* renamed from: k, reason: collision with root package name */
        public static final a f40k = new a(64, null);

        /* renamed from: l, reason: collision with root package name */
        public static final a f41l = new a(128, null);

        /* renamed from: m, reason: collision with root package name */
        public static final a f42m = new a(256, (CharSequence) null, C.b.class);

        /* renamed from: n, reason: collision with root package name */
        public static final a f43n = new a(512, (CharSequence) null, C.b.class);

        /* renamed from: o, reason: collision with root package name */
        public static final a f44o = new a(1024, (CharSequence) null, C.c.class);

        /* renamed from: p, reason: collision with root package name */
        public static final a f45p = new a(2048, (CharSequence) null, C.c.class);

        /* renamed from: q, reason: collision with root package name */
        public static final a f46q = new a(4096, null);

        /* renamed from: r, reason: collision with root package name */
        public static final a f47r = new a(8192, null);

        /* renamed from: s, reason: collision with root package name */
        public static final a f48s = new a(16384, null);

        /* renamed from: t, reason: collision with root package name */
        public static final a f49t = new a(32768, null);

        /* renamed from: u, reason: collision with root package name */
        public static final a f50u = new a(65536, null);

        /* renamed from: v, reason: collision with root package name */
        public static final a f51v = new a(131072, (CharSequence) null, C.g.class);

        /* renamed from: w, reason: collision with root package name */
        public static final a f52w = new a(262144, null);

        /* renamed from: x, reason: collision with root package name */
        public static final a f53x = new a(524288, null);

        /* renamed from: y, reason: collision with root package name */
        public static final a f54y = new a(1048576, null);

        /* renamed from: z, reason: collision with root package name */
        public static final a f55z = new a(2097152, (CharSequence) null, C.h.class);

        /* renamed from: a, reason: collision with root package name */
        final Object f56a;

        /* renamed from: b, reason: collision with root package name */
        private final int f57b;

        /* renamed from: c, reason: collision with root package name */
        private final Class f58c;

        /* renamed from: d, reason: collision with root package name */
        protected final C f59d;

        static {
            int i8 = Build.VERSION.SDK_INT;
            f12A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            f13B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, C.e.class);
            f14C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            f15D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            f16E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            f17F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            f18G = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f19H = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f20I = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f21J = new a(i8 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f22K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f23L = new a(i8 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, C.f.class);
            f24M = new a(i8 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, C.d.class);
            f25N = new a(i8 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f26O = new a(i8 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f27P = new a(i8 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f28Q = new a(i8 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f29R = new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f30S = new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f31T = new a(i8 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f32U = new a(i8 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f33V = new a(i8 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i8, CharSequence charSequence) {
            this(null, i8, charSequence, null, null);
        }

        public a a(CharSequence charSequence, C c8) {
            return new a(null, this.f57b, charSequence, c8, this.f58c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f56a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f56a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f59d == null) {
                return false;
            }
            Class cls = this.f58c;
            if (cls != null) {
                try {
                    E.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e8) {
                    Class cls2 = this.f58c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e8);
                }
            }
            return this.f59d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f56a;
            return obj2 == null ? aVar.f56a == null : obj2.equals(aVar.f56a);
        }

        public int hashCode() {
            Object obj = this.f56a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AccessibilityActionCompat: ");
            String i8 = z.i(this.f57b);
            if (i8.equals("ACTION_UNKNOWN") && c() != null) {
                i8 = c().toString();
            }
            sb.append(i8);
            return sb.toString();
        }

        public a(int i8, CharSequence charSequence, C c8) {
            this(null, i8, charSequence, c8, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i8, CharSequence charSequence, Class cls) {
            this(null, i8, charSequence, null, cls);
        }

        a(Object obj, int i8, CharSequence charSequence, C c8, Class cls) {
            this.f57b = i8;
            this.f59d = c8;
            if (obj == null) {
                this.f56a = new AccessibilityNodeInfo.AccessibilityAction(i8, charSequence);
            } else {
                this.f56a = obj;
            }
            this.f58c = cls;
        }
    }

    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        final Object f60a;

        e(Object obj) {
            this.f60a = obj;
        }

        public static e a(int i8, int i9, boolean z7, int i10) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i8, i9, z7, i10));
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        final Object f61a;

        f(Object obj) {
            this.f61a = obj;
        }

        public static f a(int i8, int i9, int i10, int i11, boolean z7, boolean z8) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i8, i9, i10, i11, z7, z8));
        }
    }

    private z(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f9a = accessibilityNodeInfo;
    }

    private boolean E() {
        return !g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int F(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i8)).get())) {
                    return sparseArray.keyAt(i8);
                }
            }
        }
        int i9 = f8d;
        f8d = i9 + 1;
        return i9;
    }

    public static z M0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new z(accessibilityNodeInfo);
    }

    public static z X() {
        return M0(AccessibilityNodeInfo.obtain());
    }

    public static z Y(z zVar) {
        return M0(AccessibilityNodeInfo.obtain(zVar.f9a));
    }

    public static z Z(View view) {
        return M0(AccessibilityNodeInfo.obtain(view));
    }

    private void d(ClickableSpan clickableSpan, Spanned spanned, int i8) {
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i8));
    }

    private void d0(View view) {
        SparseArray y7 = y(view);
        if (y7 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < y7.size(); i8++) {
                if (((WeakReference) y7.valueAt(i8)).get() == null) {
                    arrayList.add(Integer.valueOf(i8));
                }
            }
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                y7.remove(((Integer) arrayList.get(i9)).intValue());
            }
        }
    }

    private void f() {
        this.f9a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f9a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f9a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f9a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    private void f0(int i8, boolean z7) {
        Bundle u7 = u();
        if (u7 != null) {
            int i9 = u7.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i8);
            if (!z7) {
                i8 = 0;
            }
            u7.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i8 | i9);
        }
    }

    private List g(String str) {
        ArrayList<Integer> integerArrayList = this.f9a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f9a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    static String i(int i8) {
        if (i8 == 1) {
            return "ACTION_FOCUS";
        }
        if (i8 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i8) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i8) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i8) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i8) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean k(int i8) {
        Bundle u7 = u();
        return u7 != null && (u7.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i8) == i8;
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray w(View view) {
        SparseArray y7 = y(view);
        if (y7 != null) {
            return y7;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(AbstractC6244c.f39491I, sparseArray);
        return sparseArray;
    }

    private SparseArray y(View view) {
        return (SparseArray) view.getTag(AbstractC6244c.f39491I);
    }

    public CharSequence A() {
        if (!E()) {
            return this.f9a.getText();
        }
        List g8 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List g9 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List g10 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List g11 = g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f9a.getText(), 0, this.f9a.getText().length()));
        for (int i8 = 0; i8 < g8.size(); i8++) {
            spannableString.setSpan(new C0364a(((Integer) g11.get(i8)).intValue(), this, u().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) g8.get(i8)).intValue(), ((Integer) g9.get(i8)).intValue(), ((Integer) g10.get(i8)).intValue());
        }
        return spannableString;
    }

    public void A0(View view) {
        this.f10b = -1;
        this.f9a.setParent(view);
    }

    public CharSequence B() {
        return Build.VERSION.SDK_INT >= 28 ? this.f9a.getTooltipText() : this.f9a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void B0(View view, int i8) {
        this.f10b = i8;
        this.f9a.setParent(view, i8);
    }

    public String C() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f9a) : this.f9a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void C0(CharSequence charSequence) {
        this.f9a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public String D() {
        return this.f9a.getViewIdResourceName();
    }

    public void D0(boolean z7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9a.setScreenReaderFocusable(z7);
        } else {
            f0(1, z7);
        }
    }

    public void E0(boolean z7) {
        this.f9a.setScrollable(z7);
    }

    public void F0(boolean z7) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9a.setShowingHintText(z7);
        } else {
            f0(4, z7);
        }
    }

    public boolean G() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f9a) : k(64);
    }

    public void G0(View view, int i8) {
        this.f11c = i8;
        this.f9a.setSource(view, i8);
    }

    public boolean H() {
        return this.f9a.isCheckable();
    }

    public void H0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f9a, charSequence);
        } else {
            this.f9a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean I() {
        return this.f9a.isChecked();
    }

    public void I0(CharSequence charSequence) {
        this.f9a.setText(charSequence);
    }

    public boolean J() {
        return this.f9a.isClickable();
    }

    public void J0(View view) {
        this.f9a.setTraversalAfter(view);
    }

    public boolean K() {
        return this.f9a.isContextClickable();
    }

    public void K0(boolean z7) {
        this.f9a.setVisibleToUser(z7);
    }

    public boolean L() {
        return this.f9a.isEnabled();
    }

    public AccessibilityNodeInfo L0() {
        return this.f9a;
    }

    public boolean M() {
        return this.f9a.isFocusable();
    }

    public boolean N() {
        return this.f9a.isFocused();
    }

    public boolean O() {
        return k(67108864);
    }

    public boolean P() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f9a.isImportantForAccessibility();
        }
        return true;
    }

    public boolean Q() {
        return this.f9a.isLongClickable();
    }

    public boolean R() {
        return this.f9a.isPassword();
    }

    public boolean S() {
        return this.f9a.isScrollable();
    }

    public boolean T() {
        return this.f9a.isSelected();
    }

    public boolean U() {
        return Build.VERSION.SDK_INT >= 26 ? this.f9a.isShowingHintText() : k(4);
    }

    public boolean V() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f9a) : k(8388608);
    }

    public boolean W() {
        return this.f9a.isVisibleToUser();
    }

    public void a(int i8) {
        this.f9a.addAction(i8);
    }

    public boolean a0(int i8, Bundle bundle) {
        return this.f9a.performAction(i8, bundle);
    }

    public void b(a aVar) {
        this.f9a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f56a);
    }

    public void c(View view, int i8) {
        this.f9a.addChild(view, i8);
    }

    public boolean c0(a aVar) {
        return this.f9a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f56a);
    }

    public void e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            f();
            d0(view);
            ClickableSpan[] q8 = q(charSequence);
            if (q8 == null || q8.length <= 0) {
                return;
            }
            u().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", AbstractC6244c.f39502a);
            SparseArray w7 = w(view);
            for (int i8 = 0; i8 < q8.length; i8++) {
                int F7 = F(q8[i8], w7);
                w7.put(F7, new WeakReference(q8[i8]));
                d(q8[i8], (Spanned) charSequence, F7);
            }
        }
    }

    public void e0(boolean z7) {
        this.f9a.setAccessibilityFocused(z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9a;
        if (accessibilityNodeInfo == null) {
            if (zVar.f9a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(zVar.f9a)) {
            return false;
        }
        return this.f11c == zVar.f11c && this.f10b == zVar.f10b;
    }

    public void g0(Rect rect) {
        this.f9a.setBoundsInParent(rect);
    }

    public List h() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f9a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new a(actionList.get(i8)));
        }
        return arrayList;
    }

    public void h0(Rect rect) {
        this.f9a.setBoundsInScreen(rect);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f9a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i0(boolean z7) {
        this.f9a.setCheckable(z7);
    }

    public int j() {
        return this.f9a.getActions();
    }

    public void j0(boolean z7) {
        this.f9a.setChecked(z7);
    }

    public void k0(CharSequence charSequence) {
        this.f9a.setClassName(charSequence);
    }

    public void l(Rect rect) {
        this.f9a.getBoundsInParent(rect);
    }

    public void l0(boolean z7) {
        this.f9a.setClickable(z7);
    }

    public void m(Rect rect) {
        this.f9a.getBoundsInScreen(rect);
    }

    public void m0(Object obj) {
        this.f9a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f60a);
    }

    public void n(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f9a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f9a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void n0(Object obj) {
        this.f9a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f61a);
    }

    public int o() {
        return this.f9a.getChildCount();
    }

    public void o0(CharSequence charSequence) {
        this.f9a.setContentDescription(charSequence);
    }

    public CharSequence p() {
        return this.f9a.getClassName();
    }

    public void p0(boolean z7) {
        this.f9a.setDismissable(z7);
    }

    public void q0(boolean z7) {
        this.f9a.setEnabled(z7);
    }

    public CharSequence r() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f9a) : this.f9a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void r0(CharSequence charSequence) {
        this.f9a.setError(charSequence);
    }

    public CharSequence s() {
        return this.f9a.getContentDescription();
    }

    public void s0(boolean z7) {
        this.f9a.setFocusable(z7);
    }

    public CharSequence t() {
        return this.f9a.getError();
    }

    public void t0(boolean z7) {
        this.f9a.setFocused(z7);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        l(rect);
        sb.append("; boundsInParent: " + rect);
        m(rect);
        sb.append("; boundsInScreen: " + rect);
        n(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(x());
        sb.append("; className: ");
        sb.append(p());
        sb.append("; text: ");
        sb.append(A());
        sb.append("; error: ");
        sb.append(t());
        sb.append("; maxTextLength: ");
        sb.append(v());
        sb.append("; stateDescription: ");
        sb.append(z());
        sb.append("; contentDescription: ");
        sb.append(s());
        sb.append("; tooltipText: ");
        sb.append(B());
        sb.append("; viewIdResName: ");
        sb.append(D());
        sb.append("; uniqueId: ");
        sb.append(C());
        sb.append("; checkable: ");
        sb.append(H());
        sb.append("; checked: ");
        sb.append(I());
        sb.append("; focusable: ");
        sb.append(M());
        sb.append("; focused: ");
        sb.append(N());
        sb.append("; selected: ");
        sb.append(T());
        sb.append("; clickable: ");
        sb.append(J());
        sb.append("; longClickable: ");
        sb.append(Q());
        sb.append("; contextClickable: ");
        sb.append(K());
        sb.append("; enabled: ");
        sb.append(L());
        sb.append("; password: ");
        sb.append(R());
        sb.append("; scrollable: " + S());
        sb.append("; containerTitle: ");
        sb.append(r());
        sb.append("; granularScrollingSupported: ");
        sb.append(O());
        sb.append("; importantForAccessibility: ");
        sb.append(P());
        sb.append("; visible: ");
        sb.append(W());
        sb.append("; isTextSelectable: ");
        sb.append(V());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(G());
        sb.append("; [");
        List h8 = h();
        for (int i8 = 0; i8 < h8.size(); i8++) {
            a aVar = (a) h8.get(i8);
            String i9 = i(aVar.b());
            if (i9.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                i9 = aVar.c().toString();
            }
            sb.append(i9);
            if (i8 != h8.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Bundle u() {
        return this.f9a.getExtras();
    }

    public void u0(boolean z7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9a.setHeading(z7);
        } else {
            f0(2, z7);
        }
    }

    public int v() {
        return this.f9a.getMaxTextLength();
    }

    public void v0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9a.setHintText(charSequence);
        } else {
            this.f9a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void w0(View view) {
        this.f9a.setLabelFor(view);
    }

    public CharSequence x() {
        return this.f9a.getPackageName();
    }

    public void x0(int i8) {
        this.f9a.setMaxTextLength(i8);
    }

    public void y0(CharSequence charSequence) {
        this.f9a.setPackageName(charSequence);
    }

    public CharSequence z() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f9a) : this.f9a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void z0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f9a.setPaneTitle(charSequence);
        } else {
            this.f9a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void b0() {
    }
}
