$repo = 'c:\Users\awad\AppData\Local\Temp\StudentGradeTracker-rewrite'
$filter = @'
if [ "$GIT_AUTHOR_NAME" = "yaman" ] || [ "$GIT_AUTHOR_EMAIL" = "yaman-awad-yolo@hotmail.com" ]; then
  export GIT_AUTHOR_NAME="Hadi Awad"
  export GIT_AUTHOR_EMAIL="111877802+HDAW96@users.noreply.github.com"
fi
if [ "$GIT_COMMITTER_NAME" = "yaman" ] || [ "$GIT_COMMITTER_EMAIL" = "yaman-awad-yolo@hotmail.com" ]; then
  export GIT_COMMITTER_NAME="Hadi Awad"
  export GIT_COMMITTER_EMAIL="111877802+HDAW96@users.noreply.github.com"
fi
'@

git -C $repo filter-branch -f --env-filter $filter -- --all
