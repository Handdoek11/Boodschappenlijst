package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import f.AbstractC5752a;
import f.AbstractC5757f;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import o0.AbstractC6278a;

/* loaded from: classes.dex */
class a0 extends D0.c implements View.OnClickListener {

    /* renamed from: C, reason: collision with root package name */
    private final SearchView f7743C;

    /* renamed from: D, reason: collision with root package name */
    private final SearchableInfo f7744D;

    /* renamed from: E, reason: collision with root package name */
    private final Context f7745E;

    /* renamed from: F, reason: collision with root package name */
    private final WeakHashMap f7746F;

    /* renamed from: G, reason: collision with root package name */
    private final int f7747G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f7748H;

    /* renamed from: I, reason: collision with root package name */
    private int f7749I;

    /* renamed from: J, reason: collision with root package name */
    private ColorStateList f7750J;

    /* renamed from: K, reason: collision with root package name */
    private int f7751K;

    /* renamed from: L, reason: collision with root package name */
    private int f7752L;

    /* renamed from: M, reason: collision with root package name */
    private int f7753M;

    /* renamed from: N, reason: collision with root package name */
    private int f7754N;

    /* renamed from: O, reason: collision with root package name */
    private int f7755O;

    /* renamed from: P, reason: collision with root package name */
    private int f7756P;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f7757a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f7758b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f7759c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f7760d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f7761e;

        public a(View view) {
            this.f7757a = (TextView) view.findViewById(R.id.text1);
            this.f7758b = (TextView) view.findViewById(R.id.text2);
            this.f7759c = (ImageView) view.findViewById(R.id.icon1);
            this.f7760d = (ImageView) view.findViewById(R.id.icon2);
            this.f7761e = (ImageView) view.findViewById(AbstractC5757f.f35499q);
        }
    }

    public a0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f7748H = false;
        this.f7749I = 1;
        this.f7751K = -1;
        this.f7752L = -1;
        this.f7753M = -1;
        this.f7754N = -1;
        this.f7755O = -1;
        this.f7756P = -1;
        this.f7743C = searchView;
        this.f7744D = searchableInfo;
        this.f7747G = searchView.getSuggestionCommitIconResId();
        this.f7745E = context;
        this.f7746F = weakHashMap;
    }

    private Drawable A(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return B(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.f7745E.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(openInputStream, null);
            } finally {
                try {
                    openInputStream.close();
                } catch (IOException e8) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e8);
                }
            }
        } catch (FileNotFoundException e9) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e9.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e9.getMessage());
        return null;
    }

    private Drawable C(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f7745E.getPackageName() + "/" + parseInt;
            Drawable u7 = u(str2);
            if (u7 != null) {
                return u7;
            }
            Drawable e8 = AbstractC6278a.e(this.f7745E, parseInt);
            K(str2, e8);
            return e8;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable u8 = u(str);
            if (u8 != null) {
                return u8;
            }
            Drawable A7 = A(Uri.parse(str));
            K(str, A7);
            return A7;
        }
    }

    private Drawable D(Cursor cursor) {
        int i8 = this.f7754N;
        if (i8 == -1) {
            return null;
        }
        Drawable C7 = C(cursor.getString(i8));
        return C7 != null ? C7 : z();
    }

    private Drawable E(Cursor cursor) {
        int i8 = this.f7755O;
        if (i8 == -1) {
            return null;
        }
        return C(cursor.getString(i8));
    }

    private static String G(Cursor cursor, int i8) {
        if (i8 == -1) {
            return null;
        }
        try {
            return cursor.getString(i8);
        } catch (Exception e8) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e8);
            return null;
        }
    }

    private void I(ImageView imageView, Drawable drawable, int i8) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i8);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void J(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void K(String str, Drawable drawable) {
        if (drawable != null) {
            this.f7746F.put(str, drawable.getConstantState());
        }
    }

    private void L(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable u(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7746F.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence v(CharSequence charSequence) {
        if (this.f7750J == null) {
            TypedValue typedValue = new TypedValue();
            this.f7745E.getTheme().resolveAttribute(AbstractC5752a.f35371J, typedValue, true);
            this.f7750J = this.f7745E.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f7750J, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable w(ComponentName componentName) {
        PackageManager packageManager = this.f7745E.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.w("SuggestionsAdapter", e8.toString());
            return null;
        }
    }

    private Drawable x(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        if (!this.f7746F.containsKey(flattenToShortString)) {
            Drawable w7 = w(componentName);
            this.f7746F.put(flattenToShortString, w7 != null ? w7.getConstantState() : null);
            return w7;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f7746F.get(flattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f7745E.getResources());
    }

    public static String y(Cursor cursor, String str) {
        return G(cursor, cursor.getColumnIndex(str));
    }

    private Drawable z() {
        Drawable x7 = x(this.f7744D.getSearchActivity());
        return x7 != null ? x7 : this.f7745E.getPackageManager().getDefaultActivityIcon();
    }

    Drawable B(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f7745E.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor F(SearchableInfo searchableInfo, String str, int i8) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i8 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i8));
        }
        return this.f7745E.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    public void H(int i8) {
        this.f7749I = i8;
    }

    @Override // D0.a, D0.b.a
    public void a(Cursor cursor) {
        if (this.f7748H) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f7751K = cursor.getColumnIndex("suggest_text_1");
                this.f7752L = cursor.getColumnIndex("suggest_text_2");
                this.f7753M = cursor.getColumnIndex("suggest_text_2_url");
                this.f7754N = cursor.getColumnIndex("suggest_icon_1");
                this.f7755O = cursor.getColumnIndex("suggest_icon_2");
                this.f7756P = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e8) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e8);
        }
    }

    @Override // D0.a, D0.b.a
    public CharSequence d(Cursor cursor) {
        String y7;
        String y8;
        if (cursor == null) {
            return null;
        }
        String y9 = y(cursor, "suggest_intent_query");
        if (y9 != null) {
            return y9;
        }
        if (this.f7744D.shouldRewriteQueryFromData() && (y8 = y(cursor, "suggest_intent_data")) != null) {
            return y8;
        }
        if (!this.f7744D.shouldRewriteQueryFromText() || (y7 = y(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return y7;
    }

    @Override // D0.b.a
    public Cursor g(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f7743C.getVisibility() == 0 && this.f7743C.getWindowVisibility() == 0) {
            try {
                Cursor F7 = F(this.f7744D, charSequence2, 50);
                if (F7 != null) {
                    F7.getCount();
                    return F7;
                }
            } catch (RuntimeException e8) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e8);
            }
        }
        return null;
    }

    @Override // D0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i8, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i8, view, viewGroup);
        } catch (RuntimeException e8) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e8);
            View q8 = q(this.f7745E, b(), viewGroup);
            if (q8 != null) {
                ((a) q8.getTag()).f7757a.setText(e8.toString());
            }
            return q8;
        }
    }

    @Override // D0.a, android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i8, view, viewGroup);
        } catch (RuntimeException e8) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e8);
            View r8 = r(this.f7745E, b(), viewGroup);
            if (r8 != null) {
                ((a) r8.getTag()).f7757a.setText(e8.toString());
            }
            return r8;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // D0.a
    public void m(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i8 = this.f7756P;
        int i9 = i8 != -1 ? cursor.getInt(i8) : 0;
        if (aVar.f7757a != null) {
            J(aVar.f7757a, G(cursor, this.f7751K));
        }
        if (aVar.f7758b != null) {
            String G7 = G(cursor, this.f7753M);
            CharSequence v7 = G7 != null ? v(G7) : G(cursor, this.f7752L);
            if (TextUtils.isEmpty(v7)) {
                TextView textView = aVar.f7757a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f7757a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f7757a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f7757a.setMaxLines(1);
                }
            }
            J(aVar.f7758b, v7);
        }
        ImageView imageView = aVar.f7759c;
        if (imageView != null) {
            I(imageView, D(cursor), 4);
        }
        ImageView imageView2 = aVar.f7760d;
        if (imageView2 != null) {
            I(imageView2, E(cursor), 8);
        }
        int i10 = this.f7749I;
        if (i10 != 2 && (i10 != 1 || (i9 & 1) == 0)) {
            aVar.f7761e.setVisibility(8);
            return;
        }
        aVar.f7761e.setVisibility(0);
        aVar.f7761e.setTag(aVar.f7757a.getText());
        aVar.f7761e.setOnClickListener(this);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        L(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        L(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f7743C.U((CharSequence) tag);
        }
    }

    @Override // D0.c, D0.a
    public View r(Context context, Cursor cursor, ViewGroup viewGroup) {
        View r8 = super.r(context, cursor, viewGroup);
        r8.setTag(new a(r8));
        ((ImageView) r8.findViewById(AbstractC5757f.f35499q)).setImageResource(this.f7747G);
        return r8;
    }
}
