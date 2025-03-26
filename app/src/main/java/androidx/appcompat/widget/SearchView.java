package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import f.AbstractC5752a;
import f.AbstractC5755d;
import f.AbstractC5757f;
import f.AbstractC5758g;
import f.AbstractC5759h;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* renamed from: F0, reason: collision with root package name */
    static final o f7484F0;

    /* renamed from: A0, reason: collision with root package name */
    View.OnKeyListener f7485A0;

    /* renamed from: B0, reason: collision with root package name */
    private final TextView.OnEditorActionListener f7486B0;

    /* renamed from: C0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f7487C0;

    /* renamed from: D0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f7488D0;

    /* renamed from: E0, reason: collision with root package name */
    private TextWatcher f7489E0;

    /* renamed from: G, reason: collision with root package name */
    final SearchAutoComplete f7490G;

    /* renamed from: H, reason: collision with root package name */
    private final View f7491H;

    /* renamed from: I, reason: collision with root package name */
    private final View f7492I;

    /* renamed from: J, reason: collision with root package name */
    private final View f7493J;

    /* renamed from: K, reason: collision with root package name */
    final ImageView f7494K;

    /* renamed from: L, reason: collision with root package name */
    final ImageView f7495L;

    /* renamed from: M, reason: collision with root package name */
    final ImageView f7496M;

    /* renamed from: N, reason: collision with root package name */
    final ImageView f7497N;

    /* renamed from: O, reason: collision with root package name */
    private final View f7498O;

    /* renamed from: P, reason: collision with root package name */
    private q f7499P;

    /* renamed from: Q, reason: collision with root package name */
    private Rect f7500Q;

    /* renamed from: R, reason: collision with root package name */
    private Rect f7501R;

    /* renamed from: S, reason: collision with root package name */
    private int[] f7502S;

    /* renamed from: T, reason: collision with root package name */
    private int[] f7503T;

    /* renamed from: U, reason: collision with root package name */
    private final ImageView f7504U;

    /* renamed from: V, reason: collision with root package name */
    private final Drawable f7505V;

    /* renamed from: W, reason: collision with root package name */
    private final int f7506W;

    /* renamed from: a0, reason: collision with root package name */
    private final int f7507a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Intent f7508b0;

    /* renamed from: c0, reason: collision with root package name */
    private final Intent f7509c0;

    /* renamed from: d0, reason: collision with root package name */
    private final CharSequence f7510d0;

    /* renamed from: e0, reason: collision with root package name */
    private m f7511e0;

    /* renamed from: f0, reason: collision with root package name */
    View.OnFocusChangeListener f7512f0;

    /* renamed from: g0, reason: collision with root package name */
    private View.OnClickListener f7513g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f7514h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f7515i0;

    /* renamed from: j0, reason: collision with root package name */
    D0.a f7516j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f7517k0;

    /* renamed from: l0, reason: collision with root package name */
    private CharSequence f7518l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f7519m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f7520n0;

    /* renamed from: o0, reason: collision with root package name */
    private int f7521o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f7522p0;

    /* renamed from: q0, reason: collision with root package name */
    private CharSequence f7523q0;

    /* renamed from: r0, reason: collision with root package name */
    private CharSequence f7524r0;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f7525s0;

    /* renamed from: t0, reason: collision with root package name */
    private int f7526t0;

    /* renamed from: u0, reason: collision with root package name */
    SearchableInfo f7527u0;

    /* renamed from: v0, reason: collision with root package name */
    private Bundle f7528v0;

    /* renamed from: w0, reason: collision with root package name */
    private final Runnable f7529w0;

    /* renamed from: x0, reason: collision with root package name */
    private Runnable f7530x0;

    /* renamed from: y0, reason: collision with root package name */
    private final WeakHashMap f7531y0;

    /* renamed from: z0, reason: collision with root package name */
    private final View.OnClickListener f7532z0;

    public static class SearchAutoComplete extends C0844d {

        /* renamed from: v, reason: collision with root package name */
        private int f7533v;

        /* renamed from: w, reason: collision with root package name */
        private SearchView f7534w;

        /* renamed from: x, reason: collision with root package name */
        private boolean f7535x;

        /* renamed from: y, reason: collision with root package name */
        final Runnable f7536y;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC5752a.f35386m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i8 = configuration.screenWidthDp;
            int i9 = configuration.screenHeightDp;
            if (i8 >= 960 && i9 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i8 < 600) {
                return (i8 < 640 || i9 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f7484F0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f7535x) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f7535x = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f7533v <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0844d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f7535x) {
                removeCallbacks(this.f7536y);
                post(this.f7536y);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z7, int i8, Rect rect) {
            super.onFocusChanged(z7, i8, rect);
            this.f7534w.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i8, KeyEvent keyEvent) {
            if (i8 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f7534w.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i8, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z7) {
            super.onWindowFocusChanged(z7);
            if (z7 && this.f7534w.hasFocus() && getVisibility() == 0) {
                this.f7535x = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z7) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z7) {
                this.f7535x = false;
                removeCallbacks(this.f7536y);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f7535x = true;
                    return;
                }
                this.f7535x = false;
                removeCallbacks(this.f7536y);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f7534w = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i8) {
            super.setThreshold(i8);
            this.f7533v = i8;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i8) {
            super(context, attributeSet, i8);
            this.f7536y = new a();
            this.f7533v = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            SearchView.this.Y(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            D0.a aVar = SearchView.this.f7516j0;
            if (aVar instanceof a0) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z7) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f7512f0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z7);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            SearchView.this.B();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f7494K) {
                searchView.V();
                return;
            }
            if (view == searchView.f7496M) {
                searchView.R();
                return;
            }
            if (view == searchView.f7495L) {
                searchView.W();
            } else if (view == searchView.f7497N) {
                searchView.a0();
            } else if (view == searchView.f7490G) {
                searchView.H();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i8, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f7527u0 == null) {
                return false;
            }
            if (searchView.f7490G.isPopupShowing() && SearchView.this.f7490G.getListSelection() != -1) {
                return SearchView.this.X(view, i8, keyEvent);
            }
            if (SearchView.this.f7490G.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i8 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.f7490G.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i8, long j8) {
            SearchView.this.S(i8, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i8, long j8) {
            SearchView.this.T(i8);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    static class k {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i8) {
            searchAutoComplete.setInputMethodMode(i8);
        }
    }

    public interface l {
    }

    public interface m {
        boolean a(String str);

        boolean b(String str);
    }

    public interface n {
    }

    private static class o {

        /* renamed from: a, reason: collision with root package name */
        private Method f7548a;

        /* renamed from: b, reason: collision with root package name */
        private Method f7549b;

        /* renamed from: c, reason: collision with root package name */
        private Method f7550c;

        o() {
            this.f7548a = null;
            this.f7549b = null;
            this.f7550c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f7548a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f7549b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f7550c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f7549b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f7548a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f7550c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class p extends F0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: t, reason: collision with root package name */
        boolean f7551t;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i8) {
                return new p[i8];
            }
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f7551t + "}";
        }

        @Override // F0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeValue(Boolean.valueOf(this.f7551t));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7551t = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class q extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f7552a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f7553b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f7554c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f7555d;

        /* renamed from: e, reason: collision with root package name */
        private final int f7556e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7557f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f7556e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f7553b = new Rect();
            this.f7555d = new Rect();
            this.f7554c = new Rect();
            a(rect, rect2);
            this.f7552a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f7553b.set(rect);
            this.f7555d.set(rect);
            Rect rect3 = this.f7555d;
            int i8 = this.f7556e;
            rect3.inset(-i8, -i8);
            this.f7554c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z7;
            boolean z8;
            int x7 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z9 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z8 = this.f7557f;
                    if (z8 && !this.f7555d.contains(x7, y7)) {
                        z9 = z8;
                        z7 = false;
                    }
                } else {
                    if (action == 3) {
                        z8 = this.f7557f;
                        this.f7557f = false;
                    }
                    z7 = true;
                    z9 = false;
                }
                z9 = z8;
                z7 = true;
            } else if (this.f7553b.contains(x7, y7)) {
                this.f7557f = true;
                z7 = true;
            } else {
                z7 = true;
                z9 = false;
            }
            if (!z9) {
                return false;
            }
            if (!z7 || this.f7554c.contains(x7, y7)) {
                Rect rect = this.f7554c;
                motionEvent.setLocation(x7 - rect.left, y7 - rect.top);
            } else {
                motionEvent.setLocation(this.f7552a.getWidth() / 2, this.f7552a.getHeight() / 2);
            }
            return this.f7552a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f7484F0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Intent C(String str, Uri uri, String str2, String str3, int i8, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f7524r0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f7528v0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i8 != 0) {
            intent.putExtra("action_key", i8);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f7527u0.getSearchActivity());
        return intent;
    }

    private Intent D(Cursor cursor, int i8, String str) {
        int i9;
        String y7;
        try {
            String y8 = a0.y(cursor, "suggest_intent_action");
            if (y8 == null) {
                y8 = this.f7527u0.getSuggestIntentAction();
            }
            if (y8 == null) {
                y8 = "android.intent.action.SEARCH";
            }
            String str2 = y8;
            String y9 = a0.y(cursor, "suggest_intent_data");
            if (y9 == null) {
                y9 = this.f7527u0.getSuggestIntentData();
            }
            if (y9 != null && (y7 = a0.y(cursor, "suggest_intent_data_id")) != null) {
                y9 = y9 + "/" + Uri.encode(y7);
            }
            return C(str2, y9 == null ? null : Uri.parse(y9), a0.y(cursor, "suggest_intent_extra_data"), a0.y(cursor, "suggest_intent_query"), i8, str);
        } catch (RuntimeException e8) {
            try {
                i9 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i9 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i9 + " returned exception.", e8);
            return null;
        }
    }

    private Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f7528v0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void G() {
        this.f7490G.dismissDropDown();
    }

    private void I(View view, Rect rect) {
        view.getLocationInWindow(this.f7502S);
        getLocationInWindow(this.f7503T);
        int[] iArr = this.f7502S;
        int i8 = iArr[1];
        int[] iArr2 = this.f7503T;
        int i9 = i8 - iArr2[1];
        int i10 = iArr[0] - iArr2[0];
        rect.set(i10, i9, view.getWidth() + i10, view.getHeight() + i9);
    }

    private CharSequence J(CharSequence charSequence) {
        if (!this.f7514h0 || this.f7505V == null) {
            return charSequence;
        }
        int textSize = (int) (this.f7490G.getTextSize() * 1.25d);
        this.f7505V.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f7505V), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean K() {
        SearchableInfo searchableInfo = this.f7527u0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f7527u0.getVoiceSearchLaunchWebSearch() ? this.f7508b0 : this.f7527u0.getVoiceSearchLaunchRecognizer() ? this.f7509c0 : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean N() {
        return (this.f7517k0 || this.f7522p0) && !L();
    }

    private void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e8) {
            Log.e("SearchView", "Failed launch activity: " + intent, e8);
        }
    }

    private boolean Q(int i8, int i9, String str) {
        Cursor b8 = this.f7516j0.b();
        if (b8 == null || !b8.moveToPosition(i8)) {
            return false;
        }
        O(D(b8, i9, str));
        return true;
    }

    private void b0() {
        post(this.f7529w0);
    }

    private void c0(int i8) {
        Editable text = this.f7490G.getText();
        Cursor b8 = this.f7516j0.b();
        if (b8 == null) {
            return;
        }
        if (!b8.moveToPosition(i8)) {
            setQuery(text);
            return;
        }
        CharSequence d8 = this.f7516j0.d(b8);
        if (d8 != null) {
            setQuery(d8);
        } else {
            setQuery(text);
        }
    }

    private void e0() {
        boolean isEmpty = TextUtils.isEmpty(this.f7490G.getText());
        this.f7496M.setVisibility(!isEmpty || (this.f7514h0 && !this.f7525s0) ? 0 : 8);
        Drawable drawable = this.f7496M.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f7490G;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC5755d.f35413e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC5755d.f35414f);
    }

    private void h0() {
        this.f7490G.setThreshold(this.f7527u0.getSuggestThreshold());
        this.f7490G.setImeOptions(this.f7527u0.getImeOptions());
        int inputType = this.f7527u0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f7527u0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f7490G.setInputType(inputType);
        D0.a aVar = this.f7516j0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f7527u0.getSuggestAuthority() != null) {
            a0 a0Var = new a0(getContext(), this, this.f7527u0, this.f7531y0);
            this.f7516j0 = a0Var;
            this.f7490G.setAdapter(a0Var);
            ((a0) this.f7516j0).H(this.f7519m0 ? 2 : 1);
        }
    }

    private void i0() {
        this.f7493J.setVisibility((N() && (this.f7495L.getVisibility() == 0 || this.f7497N.getVisibility() == 0)) ? 0 : 8);
    }

    private void j0(boolean z7) {
        this.f7495L.setVisibility((this.f7517k0 && N() && hasFocus() && (z7 || !this.f7522p0)) ? 0 : 8);
    }

    private void k0(boolean z7) {
        this.f7515i0 = z7;
        int i8 = 8;
        int i9 = z7 ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.f7490G.getText());
        this.f7494K.setVisibility(i9);
        j0(!isEmpty);
        this.f7491H.setVisibility(z7 ? 8 : 0);
        if (this.f7504U.getDrawable() != null && !this.f7514h0) {
            i8 = 0;
        }
        this.f7504U.setVisibility(i8);
        e0();
        l0(isEmpty);
        i0();
    }

    private void l0(boolean z7) {
        int i8 = 8;
        if (this.f7522p0 && !L() && z7) {
            this.f7495L.setVisibility(8);
            i8 = 0;
        }
        this.f7497N.setVisibility(i8);
    }

    private void setQuery(CharSequence charSequence) {
        this.f7490G.setText(charSequence);
        this.f7490G.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void B() {
        if (this.f7498O.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f7492I.getPaddingLeft();
            Rect rect = new Rect();
            boolean b8 = q0.b(this);
            int dimensionPixelSize = this.f7514h0 ? resources.getDimensionPixelSize(AbstractC5755d.f35411c) + resources.getDimensionPixelSize(AbstractC5755d.f35412d) : 0;
            this.f7490G.getDropDownBackground().getPadding(rect);
            this.f7490G.setDropDownHorizontalOffset(b8 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f7490G.setDropDownWidth((((this.f7498O.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f7490G);
            return;
        }
        o oVar = f7484F0;
        oVar.b(this.f7490G);
        oVar.a(this.f7490G);
    }

    public boolean L() {
        return this.f7515i0;
    }

    void P(int i8, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i8, str));
    }

    void R() {
        if (!TextUtils.isEmpty(this.f7490G.getText())) {
            this.f7490G.setText("");
            this.f7490G.requestFocus();
            this.f7490G.setImeVisibility(true);
        } else if (this.f7514h0) {
            clearFocus();
            k0(true);
        }
    }

    boolean S(int i8, int i9, String str) {
        Q(i8, 0, null);
        this.f7490G.setImeVisibility(false);
        G();
        return true;
    }

    boolean T(int i8) {
        c0(i8);
        return true;
    }

    protected void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void V() {
        k0(false);
        this.f7490G.requestFocus();
        this.f7490G.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f7513g0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void W() {
        Editable text = this.f7490G.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f7511e0;
        if (mVar == null || !mVar.b(text.toString())) {
            if (this.f7527u0 != null) {
                P(0, null, text.toString());
            }
            this.f7490G.setImeVisibility(false);
            G();
        }
    }

    boolean X(View view, int i8, KeyEvent keyEvent) {
        if (this.f7527u0 != null && this.f7516j0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i8 == 66 || i8 == 84 || i8 == 61) {
                return S(this.f7490G.getListSelection(), 0, null);
            }
            if (i8 == 21 || i8 == 22) {
                this.f7490G.setSelection(i8 == 21 ? 0 : this.f7490G.length());
                this.f7490G.setListSelection(0);
                this.f7490G.clearListSelection();
                this.f7490G.b();
                return true;
            }
            if (i8 == 19) {
                this.f7490G.getListSelection();
                return false;
            }
        }
        return false;
    }

    void Y(CharSequence charSequence) {
        Editable text = this.f7490G.getText();
        this.f7524r0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        j0(!isEmpty);
        l0(isEmpty);
        e0();
        i0();
        if (this.f7511e0 != null && !TextUtils.equals(charSequence, this.f7523q0)) {
            this.f7511e0.a(charSequence.toString());
        }
        this.f7523q0 = charSequence.toString();
    }

    void Z() {
        k0(L());
        b0();
        if (this.f7490G.hasFocus()) {
            H();
        }
    }

    void a0() {
        SearchableInfo searchableInfo = this.f7527u0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(F(this.f7508b0, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(E(this.f7509c0, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // androidx.appcompat.view.c
    public void c() {
        if (this.f7525s0) {
            return;
        }
        this.f7525s0 = true;
        int imeOptions = this.f7490G.getImeOptions();
        this.f7526t0 = imeOptions;
        this.f7490G.setImeOptions(imeOptions | 33554432);
        this.f7490G.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f7520n0 = true;
        super.clearFocus();
        this.f7490G.clearFocus();
        this.f7490G.setImeVisibility(false);
        this.f7520n0 = false;
    }

    public void d0(CharSequence charSequence, boolean z7) {
        this.f7490G.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f7490G;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f7524r0 = charSequence;
        }
        if (!z7 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    @Override // androidx.appcompat.view.c
    public void e() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f7490G.setImeOptions(this.f7526t0);
        this.f7525s0 = false;
    }

    void f0() {
        int[] iArr = this.f7490G.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f7492I.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f7493J.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f7490G.getImeOptions();
    }

    public int getInputType() {
        return this.f7490G.getInputType();
    }

    public int getMaxWidth() {
        return this.f7521o0;
    }

    public CharSequence getQuery() {
        return this.f7490G.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f7518l0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f7527u0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f7510d0 : getContext().getText(this.f7527u0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f7507a0;
    }

    int getSuggestionRowLayout() {
        return this.f7506W;
    }

    public D0.a getSuggestionsAdapter() {
        return this.f7516j0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f7529w0);
        post(this.f7530x0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        super.onLayout(z7, i8, i9, i10, i11);
        if (z7) {
            I(this.f7490G, this.f7500Q);
            Rect rect = this.f7501R;
            Rect rect2 = this.f7500Q;
            rect.set(rect2.left, 0, rect2.right, i11 - i9);
            q qVar = this.f7499P;
            if (qVar != null) {
                qVar.a(this.f7501R, this.f7500Q);
                return;
            }
            q qVar2 = new q(this.f7501R, this.f7500Q, this.f7490G);
            this.f7499P = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        if (L()) {
            super.onMeasure(i8, i9);
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (mode == Integer.MIN_VALUE) {
            int i11 = this.f7521o0;
            size = i11 > 0 ? Math.min(i11, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f7521o0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i10 = this.f7521o0) > 0) {
            size = Math.min(i10, size);
        }
        int mode2 = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i9);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        k0(pVar.f7551t);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f7551t = L();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i8, Rect rect) {
        if (this.f7520n0 || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i8, rect);
        }
        boolean requestFocus = this.f7490G.requestFocus(i8, rect);
        if (requestFocus) {
            k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f7528v0 = bundle;
    }

    public void setIconified(boolean z7) {
        if (z7) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z7) {
        if (this.f7514h0 == z7) {
            return;
        }
        this.f7514h0 = z7;
        k0(z7);
        g0();
    }

    public void setImeOptions(int i8) {
        this.f7490G.setImeOptions(i8);
    }

    public void setInputType(int i8) {
        this.f7490G.setInputType(i8);
    }

    public void setMaxWidth(int i8) {
        this.f7521o0 = i8;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f7512f0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f7511e0 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f7513g0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f7518l0 = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z7) {
        this.f7519m0 = z7;
        D0.a aVar = this.f7516j0;
        if (aVar instanceof a0) {
            ((a0) aVar).H(z7 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f7527u0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean K7 = K();
        this.f7522p0 = K7;
        if (K7) {
            this.f7490G.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z7) {
        this.f7517k0 = z7;
        k0(L());
    }

    public void setSuggestionsAdapter(D0.a aVar) {
        this.f7516j0 = aVar;
        this.f7490G.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5752a.f35367F);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f7500Q = new Rect();
        this.f7501R = new Rect();
        this.f7502S = new int[2];
        this.f7503T = new int[2];
        this.f7529w0 = new b();
        this.f7530x0 = new c();
        this.f7531y0 = new WeakHashMap();
        f fVar = new f();
        this.f7532z0 = fVar;
        this.f7485A0 = new g();
        h hVar = new h();
        this.f7486B0 = hVar;
        i iVar = new i();
        this.f7487C0 = iVar;
        j jVar = new j();
        this.f7488D0 = jVar;
        this.f7489E0 = new a();
        f0 v7 = f0.v(context, attributeSet, f.j.f35697f2, i8, 0);
        z0.X.l0(this, context, f.j.f35697f2, attributeSet, v7.r(), i8, 0);
        LayoutInflater.from(context).inflate(v7.n(f.j.f35747p2, AbstractC5758g.f35526r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(AbstractC5757f.f35470D);
        this.f7490G = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f7491H = findViewById(AbstractC5757f.f35508z);
        View findViewById = findViewById(AbstractC5757f.f35469C);
        this.f7492I = findViewById;
        View findViewById2 = findViewById(AbstractC5757f.f35476J);
        this.f7493J = findViewById2;
        ImageView imageView = (ImageView) findViewById(AbstractC5757f.f35506x);
        this.f7494K = imageView;
        ImageView imageView2 = (ImageView) findViewById(AbstractC5757f.f35467A);
        this.f7495L = imageView2;
        ImageView imageView3 = (ImageView) findViewById(AbstractC5757f.f35507y);
        this.f7496M = imageView3;
        ImageView imageView4 = (ImageView) findViewById(AbstractC5757f.f35471E);
        this.f7497N = imageView4;
        ImageView imageView5 = (ImageView) findViewById(AbstractC5757f.f35468B);
        this.f7504U = imageView5;
        z0.X.r0(findViewById, v7.g(f.j.f35752q2));
        z0.X.r0(findViewById2, v7.g(f.j.f35772u2));
        imageView.setImageDrawable(v7.g(f.j.f35767t2));
        imageView2.setImageDrawable(v7.g(f.j.f35737n2));
        imageView3.setImageDrawable(v7.g(f.j.f35722k2));
        imageView4.setImageDrawable(v7.g(f.j.f35782w2));
        imageView5.setImageDrawable(v7.g(f.j.f35767t2));
        this.f7505V = v7.g(f.j.f35762s2);
        k0.a(imageView, getResources().getString(AbstractC5759h.f35542n));
        this.f7506W = v7.n(f.j.f35777v2, AbstractC5758g.f35525q);
        this.f7507a0 = v7.n(f.j.f35727l2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f7489E0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f7485A0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(v7.a(f.j.f35742o2, true));
        int f8 = v7.f(f.j.f35707h2, -1);
        if (f8 != -1) {
            setMaxWidth(f8);
        }
        this.f7510d0 = v7.p(f.j.f35732m2);
        this.f7518l0 = v7.p(f.j.f35757r2);
        int k8 = v7.k(f.j.f35717j2, -1);
        if (k8 != -1) {
            setImeOptions(k8);
        }
        int k9 = v7.k(f.j.f35712i2, -1);
        if (k9 != -1) {
            setInputType(k9);
        }
        setFocusable(v7.a(f.j.f35702g2, true));
        v7.x();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f7508b0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f7509c0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f7498O = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.f7514h0);
        g0();
    }
}
